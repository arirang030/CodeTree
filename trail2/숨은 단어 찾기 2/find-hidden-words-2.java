import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.charAt(j);
            }
        }
        // Please write your code here.

        // 상 하 좌 우 상좌 상우 하좌 하우
        int NUM_DIR = 8;

        int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
        int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    for (int k = 0; k < NUM_DIR; k++) {
                        if (i + 2 * dx[k] >= 0 && i + 2 * dx[k] < n
                        && j + 2 * dy[k] >= 0 && j + 2 * dy[k] < m
                        && arr[i + dx[k]][j + dy[k]] == 'E' 
                        && arr[i + 2 * dx[k]][j + 2 * dy[k]] == 'E') {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}