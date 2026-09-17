import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        int n = a.length();
        int[] arr = new int[n];
        boolean isChange = false;
        for (int i = 0; i < n; i++) {
            if (!isChange && a.charAt(i) - '0' == 0) {
                arr[i] = 1;
                isChange = true;
            } else {
                arr[i] = a.charAt(i) - '0';
            }
        }
        if (!isChange) {
            arr[n - 1] = 0;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                int tmp = 1;
                for (int j = i + 1; j < n; j++) {
                    tmp *= 2;
                }
                ans += tmp;
            }
        }
        // System.out.println(Arrays.toString(arr));
        System.out.print(ans);
    }
}