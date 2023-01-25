import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        입력 갯수 = N
        입력 받은 수를 정렬하여 출력
        입력 할 숫자를 입력받는다
        입력 받은 숫자 N개의 갯수만큼 숫자를 입력받는다
        받은 숫자를 배열에 넣어 정렬한다
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int val : arr) {
            System.out.println(val);
        }


    }
}
