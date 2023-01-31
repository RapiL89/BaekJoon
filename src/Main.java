import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int[] stack;
    public static int size = 0;
    public static void main(String [] args) {
        /*
        케이스 갯수 = T
        push = 정수 X를 스택에 넣는다
        pop = 스택에서 가장 위에있는 정수를 빼고 그 수를 출력, 정수가 없을 경우 -1 출력
        size = 스택에 있는 정수의 개수 출력
        empty = 스택이 비어있으면 1, 아니면 0 출력
        top = 스택의 가장 위에있는 정수 출력, 정수가 없을 경우 -1 출력
         */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        stack = new int[N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            switch (str) {
                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
            }
        }

    }

    public static int push (int item) {
        if (size == 0) {
            return -1;
        }
        else {
            int res = stack[size -1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }
}
