package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1546_re2 {
    public static void main(String[] args) throws IOException {

        /*
        각 과목의 점수를 입력받는다
        과목의 점수 중 최대값을 구한다
        점수/최대값 *100을 하여 새로운 점수를 구한다
        3개 과목의 새로운 평균 구하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double math[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < math.length; i++) {
            math[i] = Double.parseDouble(st.nextToken());
        }
        double sum = 0;
        Arrays.sort(math);

        for (int i = 0; i < math.length; i++ ) {
            sum += ((math[i] / math[math.length -1]) *100);
        }
        System.out.println(sum/math.length);


    }
}
