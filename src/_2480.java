import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = Math.max(Math.max(A, B), C);

        if (A != B && A != C && B != C) {
            System.out.println(D * 100);
        }

        else {
            if (A == B && B== C) {
                System.out.println(10000 + ((A + B + C)/3) * 1000);
            }
            else {
                if (A == B || A == C) {
                    System.out.println(1000 + A * 100);
                } else {
                    System.out.println(1000 + B * 100);
                }
            }
        }
    }
}
