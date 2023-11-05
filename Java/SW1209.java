import java.io.*;
import java.util.*;

public class SW1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] graph = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //가로합
            int w_sum; int w_max = 0;
            //세로합
            int h_sum; int h_max = 0;
            
            for (int i = 0; i < 100; i++) {
                w_sum = 0; h_sum = 0;
                for (int j = 0; j < 100; j++) {
                    w_sum += graph[i][j];
                    h_sum += graph[j][i];
                }
                if (w_max < w_sum) {
                    w_max = w_sum;
                }
                if (h_max < h_sum) {
                    h_max = h_sum;
                }
            }
            int c = Math.max(w_max, h_max);
            
            //대각선 왼쪽합
            int ld_sum = 0; int x_idx = 0; int y_idx = 0; 
            //대각선 오른쪽합
            int rd_sum = 0; int x_idx2 = 99; int y_idx2 = 0;
            for (int i = 0; i < 100; i++) {
                ld_sum += graph[x_idx][y_idx];
                rd_sum += graph[y_idx2][x_idx2];
                x_idx++; y_idx++;
                y_idx2++; x_idx2--;
            }
            int d = Math.max(ld_sum, rd_sum);

            System.out.println("#" + t + " " + Math.max(c, d));
        } 
    }
}