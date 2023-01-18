import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ding = Integer.parseInt(br.readLine());
        String ring = "*";
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i <= ding; i++) {
            System.out.println(sb.append(ring));
        }
    }
}
