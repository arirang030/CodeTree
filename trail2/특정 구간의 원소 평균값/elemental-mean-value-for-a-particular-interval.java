import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = n;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                int avg = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                avg = (sum % (j - i + 1) == 0) ? sum / (j - i + 1) : 0;
                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}