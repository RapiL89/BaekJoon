import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11022_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ring = Integer.parseInt(br.readLine());
        int ding;
        int dong;
        StringTokenizer st;

        for (int i = 1; i <= ring; i++) {
            st = new StringTokenizer(br.readLine()," ");
            ding = Integer.parseInt(st.nextToken());
            dong = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + ding + " + " + dong + " = " + (ding + dong));
        }
        br.close();
    }
}
