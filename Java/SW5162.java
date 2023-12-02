import java.io.*;
import java.util.*;

public class SW5162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int answer = 0;

            answer = Math.min(A, B);

            answer = C / answer;

            System.out.println("#" + t + " " + answer);
        }
    }
}
