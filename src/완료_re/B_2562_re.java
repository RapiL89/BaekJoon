package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2562_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int A = 0; // 최대값
        int B = 0; // 몇번째
        int C = 0; // 몇번째인지 알기위한 변수

        for (int value : arr) { //arr의 값들을 순서대로 비교한다
            C++;
            if (value > A) { //순서대로 A와 비교했을때
              A = value; // value가 A보다 크면 value는 A가 된다
              B = C; // B는 C가 된다
            }
        }
        System.out.println(A);
        System.out.println(B);
    }
}
