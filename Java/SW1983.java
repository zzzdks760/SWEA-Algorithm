import java.io.*;
import java.util.*;

public class SW1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            Double[] score = new Double[N];
            double find_score = 0.0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());
                int c = Integer.parseInt(st2.nextToken());

                score[i] = a*0.35 + b*0.45 + c*0.20;

                if (i+1 == K) {
                    find_score = score[i];
                }
            }
            
            Arrays.sort(score, Collections.reverseOrder());

            int idx = 0;
            for (int i = 0; i < score.length; i++) {
                if (score[i] == find_score) {
                    idx = i;
                    break;
                }
            }
            idx = idx / (N/10);
            System.out.println("#" + t + " " + grade[idx]);
        }
    }
}