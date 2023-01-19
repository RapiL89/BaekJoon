package 완료_re;

import java.io.*;
import java.util.StringTokenizer;

public class B_10807_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] num = new int[price];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            //num의 i(0~첫번째 입력값인 price만큼)번째에다가 숫자를 넣는다
        }
        int searchNum = Integer.parseInt(br.readLine());
        // 찾을 숫자 입력
        int cnt = 0;
        //초기값 설정
        for (int i = 0; i < num.length; i++) {
            if(num[i]==searchNum) {
                // num의 i번째 인자가 searchNum과 같다면
                // cnt에 1을 더한다
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
