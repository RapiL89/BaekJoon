package 완료_re;

import java.util.Scanner;
import java.util.Stack;

public class B_10773_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();

            if (num != 0) {
                stack.push(num);
            } else stack.pop();

        }
        int sum = 0;
        for (int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }
}

