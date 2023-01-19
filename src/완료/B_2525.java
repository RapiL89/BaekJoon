package 완료;

import java.util.Scanner;

public class B_2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ring = sc.nextInt();
        int ding = sc.nextInt();
        int dong = sc.nextInt();
        int wing;

        //1시간 == 60분
        //24시간 == 0

        wing = ring * 60 + ding + dong; // 완료시간


        System.out.println(((wing/60)%24) + " " + (wing%60));

    }
}
