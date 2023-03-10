package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11021_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ring = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 1; i <= ring; i++) {
            st = new StringTokenizer(br.readLine()," ");
            System.out.println("Case #" + i + ": "
            +(Integer.parseInt(st.nextToken())
            +Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}
