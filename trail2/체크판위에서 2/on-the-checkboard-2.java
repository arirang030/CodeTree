import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        // 1. 점프 시 현재와 다른 색이어야 함
        // 2. 오른쪽, 아래쪽 동시에 한칸 이상 이동해야 함
        int cnt = 0;
        char cur = grid[0][0];
        for (int r = 1; r < R - 1; r++) {
            for (int c = 1; c < C - 1; c++) {
                if (grid[r][c] != grid[0][0]) {
                    cur = grid[r][c];
                    for (int i = r + 1; i < R - 1; i++) {
                        for (int j = c + 1; j < C - 1; j++) {
                            if (cur != grid[i][j] && grid[i][j] != grid[R - 1][C - 1]) {
                                cnt++;
                                // System.out.printf("(%d, %d) -> (%d, %d)\n", r, c, i, j);
                            }
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}