package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5597_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[31];

        for (int i = 1; i < 29; i++) {
            int num1 = Integer.parseInt(br.readLine());
            arr[num1] = 1;
            }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != 1)
                System.out.println(j);}
        }

    }
