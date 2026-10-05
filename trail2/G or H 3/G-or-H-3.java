import java.util.Scanner;
public class Main {

    static int MAX_INDEX = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[MAX_INDEX];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt() - 1;
            char c = sc.next().charAt(0);
            arr[pos] = (c == 'G') ? 1 : 2;
        }
        // Please write your code here.
        int max = 0;
        for (int i = 0; i + k <= MAX_INDEX; i++) {
            int sum = 0;
            for (int j = i; j < MAX_INDEX && j <= i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(sum, max);
        }
        System.out.print(max);
    }
}