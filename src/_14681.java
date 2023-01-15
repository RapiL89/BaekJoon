import java.util.Scanner;

public class _14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int wing = sc.nextInt();
        int ring = sc.nextInt();

        if (wing > 0 && ring > 0) {
            System.out.println("1");
        } else if (wing < 0 && ring < 0) {
            System.out.println("3");
        } else if (wing > 0 && ring < 0) {
            System.out.println("4");
        } else if (wing < 0 && ring > 0) {
            System.out.println("2");
        }

    }
}
