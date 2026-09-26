import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        boolean 세로 = false, 가로 = false, 오른쪽대각선 = false, 왼쪽대각선 = false;
        for (int i = 0; i < 19; i++) {
            if (세로 || 가로 || 오른쪽대각선 || 왼쪽대각선) {
                break;
            }
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] != 0) {
                    세로 = true;
                    for (int r = i + 1; r < i + 5; r++) {
                        if (r >= 19 || arr[i][j] != arr[r][j]) {
                            세로 = false;
                            break;
                        }
                    }
                    if (세로) {
                        System.out.println(arr[i][j]);
                        System.out.printf("%d %d", i + 3, j + 1);
                        break;
                    }

                    가로 = true;
                    for (int c = j + 1; c < j + 5; c++) {
                        if (c >= 19 || arr[i][j] != arr[i][c]) {
                            가로 = false;
                            break;
                        }
                    }
                    if (가로) {
                        System.out.println(arr[i][j]);
                        System.out.printf("%d %d", i + 1, j + 3);
                        break;
                    }

                    오른쪽대각선 = true;
                    for (int r = i + 1, c = j + 1; r < i + 5 && c < j + 5; r++, c++) {
                        if (r >= 19 || c >= 19 || arr[i][j] != arr[r][c]) {
                            오른쪽대각선 = false;
                            break;
                        }
                    }
                    if (오른쪽대각선) {
                        System.out.println(arr[i][j]);
                        System.out.printf("%d %d", i + 3, j + 3);
                        break;
                    }

                    왼쪽대각선 = true;
                    for (int r = i + 1, c = j - 1; r < i + 5 && c > j - 5; r++, c--) {
                        if (r >= 19 || c < 0 || arr[i][j] != arr[r][c]) {
                            왼쪽대각선 = false;
                            break;
                        }
                    }
                    if (왼쪽대각선) {
                        System.out.println(arr[i][j]);
                        System.out.printf("%d %d", i + 3, j - 1);
                        break;
                    }
                }
            }
        }
        if (!(세로 || 가로 || 오른쪽대각선 || 왼쪽대각선)) {
            System.out.print(0);
        }
    }
}