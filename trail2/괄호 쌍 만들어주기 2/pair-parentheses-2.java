import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        int numLeft = 0;
        int ans = 0;
        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) == A.charAt(i+1) && A.charAt(i) == '(') {
                numLeft++;
            }
            else if (A.charAt(i) == A.charAt(i+1) && A.charAt(i) == ')') {
                ans += numLeft;
            }
        }
        System.out.print(ans);
    }
}