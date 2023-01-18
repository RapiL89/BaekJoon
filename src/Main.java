import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        0 <= num <= 99;
//        if (num < 10) {
//            System.out.println("0" + num);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ring = Integer.toString(Integer.parseInt(br.readLine()));

        StringTokenizer st;

        st = new StringTokenizer(ring, "");

        String [] str = new String[2];




//            ring
//            26;
//            2 + 6; // StringTokenizer로 "+" 를 기준으로 문자열을 나눔 이때, Integer.parseInt로 랩핑해줘야함;
            System.out.println(ring + 1);
    }

}
