import java.util.*;
import java.io.*;

public class Test {
    static int[] score;
    static int[] kcal;
    static int N, L, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            score = new int[N];
            kcal = new int[N];
            

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                score[i] = Integer.parseInt(st.nextToken());
                kcal[i] = Integer.parseInt(st.nextToken());
            }
            answer = 0;
            dfs(0, 0, 0);
            System.out.println("#" + t + " " + answer);
        }
    }

    static void dfs(int scr, int kal, int idx) {
        if (kal > L) {
            return;
        }

        if (idx == N) {
            answer = Math.max(answer, scr);
            return;
        }

        dfs(scr + score[idx], kal + kcal[idx] , idx+1);
        dfs(scr, kal, idx+1);
    }
}