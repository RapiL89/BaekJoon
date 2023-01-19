package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_1110_re {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ring = Integer.parseInt(br.readLine());

        int ding = 0;
        int dong = ring;

        do {
            ring = ((ring % 10) * 10) + (((ring / 10) + (ring % 10)) %10);
            ding++;
        } while (dong != ring);
        System.out.println(ding);
    }

}
