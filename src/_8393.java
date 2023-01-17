import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ring = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= ring; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
