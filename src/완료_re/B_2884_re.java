package 완료_re;

import java.util.Scanner;

public class B_2884_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wing = sc.nextInt();
        int ring = sc.nextInt();

//        if (ring < 45) {
//            wing--;
//            ring = 60 - (45 - ring);
//            if (wing < 0) {
//                wing = 23;
//            }
//            System.out.println(wing + " " + ring);
//        } else {
//            System.out.println(wing + " " + (ring - 45));
//        }

        if (wing == 0 && ring > 45) {
            System.out.println(24 + " " + ((ring - 45)));
        } else if (wing == 0 && ring == 45) {
            System.out.println(wing + " " + (ring - 45));
        } else if (wing == 0 && ring < 45) {
            System.out.println(23 + " " + ((ring - 45) + 60));
        } else if (ring > 45) {
            System.out.println(wing + " " + (ring - 45));
        } else if (ring < 45) {
            System.out.println((wing - 1) + " " + ((ring -45) + 60));
        }

    }
}
