import java.util.Scanner;

public class _2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ring = sc.nextInt();
        int ding;

        for (int i = 1; i < 10; ++i) {
            ding = ring * i;
            System.out.print(ring + " " + "*" + " " + i + " " + "=" + " " + ding + "\n");
        }

    }
}
