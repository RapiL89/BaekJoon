package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10871_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //갯수
        int X = Integer.parseInt(st.nextToken()); //숫자

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < A; i++) {
            int B = Integer.parseInt(st.nextToken());

            if (B < X) {
                sb.append(B).append(" ");
            }
        }

        System.out.println(sb);
    }
}
