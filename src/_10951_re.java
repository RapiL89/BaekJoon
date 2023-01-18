import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10951_re {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str=br.readLine()) !=null) {
            st = new StringTokenizer(str," ");
            int ring = Integer.parseInt(st.nextToken());
            int ding = Integer.parseInt(st.nextToken());
            sb.append(ring + ding).append("\n");

        }
        System.out.println(sb);
    }
}

