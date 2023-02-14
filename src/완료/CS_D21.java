package 완료;

import java.util.Arrays;

public class  CS_D21{
    public static void main(String[] args) {
        int[] arr = {4, -15, 0, -1, 5};

        Arrays.sort(arr);

        int sum = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];

        int sum2 = arr[arr.length - 1] * arr[0] * arr[1];

        if (sum < sum2) {
            System.out.println(sum2);
        } else System.out.println(sum);

    }
}
