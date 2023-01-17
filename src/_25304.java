import java.util.Scanner;

//class Product {
//    private int ding, dong;
//    static int sum = 0;
//    Product (int ding, int dong) {
//        this.ding = ding;
//        this.dong = dong;
//        productSum();
//    }
//    private void productSum() {
//        sum += ding * dong;
//    }
//}
public class _25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt(); // 총 금액
        int ring = sc.nextInt(); // 종류의 수

        int sum = 0;
        for (int i = 0; i < ring; i++) {
            int ding = sc.nextInt();
            int dong = sc.nextInt();

            sum += (ding * dong);


            }if (sum == price) {
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
