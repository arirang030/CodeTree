import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        int n = A.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = A.charAt(i);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '(') {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}