import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.

        // 세로 1칸, 가로 3칸
        int[][] memo = new int[n][n-2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-2; j++) {
                memo[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2];
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-2; j++) {
                int tmp1 = memo[i][j];
                // 다음 열부터
                for (int k = j+3; k < n-2; k++) {
                    int tmp2 = memo[i][k];
                    max = (tmp1 + tmp2 > max) ? tmp1 + tmp2 : max;
                }
                // 다음 행부터
                for (int k = i+1; k < n; k++) {
                    for (int h = 0; h < n-2; h++) {
                        int tmp2 = memo[k][h];
                        max = (tmp1 + tmp2 > max) ? tmp1 + tmp2 : max;
                    }
                }
            }
        }
        System.out.print(max);
    }
}