package 완료_re;

import java.util.Scanner;

public class B_2588_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = sc.nextInt();
        String two = sc.next();

        sc.close();

        System.out.println(one * (two.charAt(2) - '0'));
        System.out.println(one * (two.charAt(1) - '0'));
        System.out.println(one * (two.charAt(0) - '0'));
        System.out.println(one * Integer.parseInt(two));

    }
}
