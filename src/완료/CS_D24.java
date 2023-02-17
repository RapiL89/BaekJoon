package 완료;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CS_D24 {


    public static void main(String[] args) {

        int[] base = new int[]{1, 5, 7, 9, 11};
        int[] sample = new int[]{1, 5, 11};

        int count = 0;
        for (int i = 0; i < sample.length; i++) {

            int B = sample[i];

            if (IntStream.of(base).anyMatch(x -> x == B)) {
                count++;

            } else System.out.println("실패");

            if (count == sample.length) {
                System.out.println("성공");
            }


        }

    }
}