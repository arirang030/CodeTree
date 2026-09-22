import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int tmp = 0;
                    int times10 = 1;
                    int tmpI = arr[i], tmpJ = arr[j], tmpK = arr[k];
                    while (tmpI > 0 || tmpJ > 0 || tmpK > 0) {
                        tmp += ((tmpI % 10 + tmpJ % 10 + tmpK % 10) % 10) * times10;
                        times10 *= 10;
                        tmpI /= 10; tmpJ /= 10; tmpK /= 10;
                    }
                    if (arr[i] + arr[j] + arr[k] == tmp && tmp > max) {
                        max = tmp;
                    }
                }
            }
        }
        System.out.print(max);
    }
}