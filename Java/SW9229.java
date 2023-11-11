import java.io.*;
import java.util.*;

public class SW9229 {
    static int[] kg;
    static int N, M, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            kg = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                kg[i] = Integer.parseInt(st.nextToken());
            }

            answer = -1;

            dfs(0, 0, 0);

            if (answer == -1) {
                System.out.println("#" + t + " " + -1);
            } else {
                System.out.println("#" + t + " " + answer);
            }
            
        }
    }

    static void dfs(int idx, int sum, int cnt) {
        if (sum > M) {
            return;
        }

        if (cnt == 2) {
            if (answer < sum) {
                answer = sum;
            }
            return;
        }

        if (idx == N) return;

        dfs(idx+1, sum + kg[idx], cnt+1);
        dfs(idx+1, sum, cnt);
    }

}