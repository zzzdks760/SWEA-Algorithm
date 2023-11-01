import java.io.*;
import java.util.*;

public class SW1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int[] score = new int[101];
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                int x = Integer.parseInt(st.nextToken());
                score[x]++;
            }
            // int max = Arrays.stream(score).max().getAsInt();
            
            int result = 0;
            int max = 0;
            for (int i = 0; i < score.length; i++) {
                if (score[i] >= max) {
                    max = score[i];
                    result = i;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}