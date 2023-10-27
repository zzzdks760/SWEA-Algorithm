import java.io.*;
import java.util.*;

public class SW2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st1.nextToken());
            int M = Integer.parseInt(st1.nextToken());

            int[][] graph = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    graph[i][j] = Integer.parseInt(st2.nextToken());
                }
            }
            int answer = 0;
            for (int i = 0; i <= N-M; i++) { //행
                for (int j = 0; j <= N-M; j++) { //열
                    int max = 0;
                    for (int k = i; k < i+M; k++) { //행
                        for (int l = j; l < j+M; l++) { //열
                            max += graph[k][l];
                        }
                    }
                    answer = Math.max(max, answer);
                }
            }
            System.out.println("#" + t + " " + answer);
        }
    }
}
