package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2675_re {
    public static void main(String[] args) throws IOException {
        /*
        케이스 수  = T
        반복 횟수 = R
        결과 = P

        테스트를 진행 할 횟수를 입력받는다
        반복을 진행 할 횟수와 반복 할 문자열을 입력받는다
        charAt 통해 하나의 인덱스당 반복횟수 R만큼 반복하여 출력한다
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            String [] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
