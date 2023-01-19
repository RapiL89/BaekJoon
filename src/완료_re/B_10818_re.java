package 완료_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10818_re {
    public static void main(String[] args) throws IOException {
        //첫째 줄에 정수의 개수 N 입력
        //둘째 줄에 N개의 정수를 공백으로 구분해서 입력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 0;
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[A - 1]);
        }
    }

