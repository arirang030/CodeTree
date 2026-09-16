import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        int min = 0;
        for (int i = 0; i < n; i++) {
            min += a[i] * i;
        }
        
        for (int i = 1; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += a[j] * Math.abs(i - j);
            }
            if (tmp < min) {
                min = tmp;
            }
        }

        System.out.print(min);
    }
}