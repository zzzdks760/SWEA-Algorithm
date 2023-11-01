import java.io.*;
import java.util.*;

public class SW1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            Double[] score = new Double[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < 10; i++) {
                
                double x = Integer.parseInt(st.nextToken());
                score[i] = x;
            }

            Arrays.sort(score);

            double sum = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 9) {
                    continue;
                } else {
                    sum += score[i];
                }
            }
            System.out.println(Math.round(sum/8));
            // System.out.println("#" + t + " " + sum/8);
        }
    }
}