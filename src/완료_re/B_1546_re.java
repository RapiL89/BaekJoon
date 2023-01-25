package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1546_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double S[]  = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < S.length; i++) {
            S[i] = Double.parseDouble(st.nextToken());
        }
        double sum = 0;
        Arrays.sort(S);

        for (int i = 0; i < S.length; i++) {
            sum += ((S[i] / S[S.length - 1]) * 100);
        }
        System.out.print(sum / S.length);
    }
}
