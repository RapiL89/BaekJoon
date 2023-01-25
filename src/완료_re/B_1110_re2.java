package 완료_re;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B_1110_re2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int count = 0;
        int num = Integer.parseInt(br.readLine());
        int result = num;

        do {
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            count++;
            }
        while (result != num );
        System.out.println(count);

    }
}
