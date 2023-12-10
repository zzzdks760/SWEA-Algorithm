import java.io.*;
import java.util.*;

public class SW3456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int answer = 0;

            if (a == b) {
                answer = c;
            } else if (a == c) {
                answer = b;
            } else if (b == c) {
                answer = a;
            }
            System.out.println("#" + t + " " + answer);
        }
    }
}
