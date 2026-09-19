import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        // 시작 방이 1번 방인 경우
        int min = 0;
        for (int i = 0; i < n; i++) {
            min += arr[i] * i;
        }

        // ex) (1 - 2 + 5) % 5 = 4
        // 시작 방이 2 ~ N번 방인 경우
        for (int i = 1; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += arr[j] * ((j - i + n) % n);
            }
            if (tmp < min) {
                min = tmp;
            }
        }

        System.out.print(min);
    }
}