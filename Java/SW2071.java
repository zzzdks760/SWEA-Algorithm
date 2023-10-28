package JAVA;

import java.io.*;
import java.util.*;

public class SW2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += Integer.parseInt(st.nextToken());
                System.out.println(sum);
            }
            System.out.println("#" + t + " " + (int) Math.round(sum / 10));
        }
    }
}