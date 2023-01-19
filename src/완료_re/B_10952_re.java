package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10952_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {


            st = new StringTokenizer(br.readLine()," ");

            int ring = Integer.parseInt(st.nextToken());
            int ding = Integer.parseInt(st.nextToken());

            if (ring == 0 && ding == 0) {
                break;
            }
            sb.append((ring+ding)).append("\n");
        }
        System.out.println(sb);

    }
}
