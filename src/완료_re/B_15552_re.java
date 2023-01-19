package 완료_re;

import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class B_15552_re {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sd = new BufferedWriter(new OutputStreamWriter(System.out));
        int ring = Integer.parseInt(sc.readLine());

        StringTokenizer sa;

        for (int i = 0; i < ring; i++) {
            sa = new StringTokenizer(sc.readLine()," ");
            sd.write((Integer.parseInt(sa.nextToken()) + Integer.parseInt(sa.nextToken())) + "\n");

        }
        sc.close();

        sd.flush();
        sd.close();
    }
}
