import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        // 1번, N번 건너뛰기X
        // 체크포인트 한 개 건너뛰어서 마라톤 완주
        // 최소 거리 구하기

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            // 건너뛸 좌표에 이전 좌표값 넣기(어차피 거리 0이니까)
            int tmpX = x[i];
            int tmpY = y[i];
            x[i] = x[i - 1];
            y[i] = y[i - 1];

            // 거리 구하기
            int tmpDistance = 0;
            for (int j = 0; j < n - 1; j++) {
                tmpDistance += Math.abs(x[j] - x[j + 1]) + Math.abs(y[j] - y[j + 1]);
            }

            // 거리를 구한 뒤 다시 원상복구하기
            x[i] = tmpX;
            y[i] = tmpY;

            if (tmpDistance < min) {
                min = tmpDistance;
            }
        }
        System.out.print(min);
    }
}