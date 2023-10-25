import java.io.*;
import java.util.*;

public class SW1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            
            //A회사 수도세
            int A = P*W;
            //B회사 수도세
            int B = 0;
            if (R < W) {
                B = (W - R) * S + Q;
            } else {
                B = Q;
            }

            int min = Math.min(A, B);

            System.out.println("#" + i + " " + min);
        }
    }
}
