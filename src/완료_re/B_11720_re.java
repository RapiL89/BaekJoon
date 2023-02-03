package 완료_re;

import java.util.Scanner;

public class B_11720_re {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String N = sc.next();
        sc.close();
        int sum = 0;

        for (int i = 0; i < T; i++) {
            sum = sum + N.charAt(i) -'0';
        }
        System.out.println(sum);
    }
}