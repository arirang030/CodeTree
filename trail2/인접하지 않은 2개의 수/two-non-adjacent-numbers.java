import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                int tmp = arr[i] + arr[j];
                if (tmp > max) max = tmp;
            }
        }
        System.out.print(max);
    }
}