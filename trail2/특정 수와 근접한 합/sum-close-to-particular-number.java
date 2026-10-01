import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        // 최솟값 디폴트
        int min = 0;
        for (int i = 0; i < n-2; i++) {
            min += arr[i];
        }
        min = Math.abs(min - s);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    sum += arr[k];
                }
                int t = Math.abs(sum - s);
                min = (t < min) ? t : min;
            }
        }
        System.out.print(min);
    }
}