package 완료;

import java.util.Scanner;

public class B_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int j[] = new int[C]; //결과값을 저장하기 위해 배열 생성, j라는 배열안에 C의 숫자만큼 크기 할당


        for (int i = 0; i < C; i++) {
            // i는 배열 크기인 C보다 작아야하며 C와 같거나 커지면 for문 종료
            int ring = sc.nextInt();
            int ding = sc.nextInt();
            j[i] = ring + ding;
            // j배열에 i번째에 결과값을 넣는다
        }
        for (int k : j) {
            System.out.println(k);
        }

    }
}
