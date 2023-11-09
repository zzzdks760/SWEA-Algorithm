import java.io.*;
import java.util.*;

public class SW5215 {
    static StringBuilder sb = new StringBuilder();
    static int[] score;
    static int[] kcal;
    static int N, L, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
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

            sb.append("#").append(t).append(" ").append(answer);
        }
        System.out.println(sb);
    }

    static void dfs(int idx, int scr, int kal) {
        if (kal > L) {
            return;
        }
        if (idx == N) {
            answer = Math.max(answer, scr);
            return;
        }

        //재료를 추가하는 경우
        dfs(idx + 1, scr + score[idx], kal + kcal[idx]);
        //재료를 추가하지 않고 건너띄는 경우
        dfs(idx + 1, scr, kal);
    }
}