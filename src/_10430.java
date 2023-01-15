import java.util.Scanner;

public class _10430 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int one = (A+B)%C;
        int two = ((A%C)+(B%C))%C;
        int three = (A*B)%C;
        int four = ((A%C)*(B%C))%C;

        System.out.println(one + "\n" + two + "\n" + three  + "\n" + four);

    }
}
