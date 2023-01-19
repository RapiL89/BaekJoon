package 완료;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ring = Integer.parseInt(br.readLine());
        String ding = "*";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ring; i++) {
            String format = String.format("%" + ring+ "s", ding);
            System.out.println(format);
            ding += "*";

        }

    }
}