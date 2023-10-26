import java.io.*;
import java.util.*;

public class SW1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] graph = new int[N][N];

            //graph 채우기
            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    graph[i][j] = Integer.parseInt(st2.nextToken());

                }
            }
            

            int answer = 0;
            for (int x = 0; x < N; x++) {
                int w_cnt = 0; int h_cnt = 0;
                for (int y = 0; y < N; y++) {
                    //가로
                    if (graph[x][y] == 1) {
                        w_cnt++;
                    } else {
                        w_cnt = 0;
                    }
                    
                    if (w_cnt == K && y != N-1 && graph[x][y+1] == 0) {
                        answer++;
                    } else if (w_cnt == K && y == N-1) {
                        answer++;
                    }
                    
                    //세로
                    if (graph[y][x] == 1) {
                        h_cnt++;
                    } else {
                        h_cnt = 0;
                    }

                    if (h_cnt == K && y != N-1 && graph[y+1][x] != 1) {
                        answer++;
                    } else if (h_cnt == K && y == N-1) {
                        answer++;
                    }

                }    
            }

            System.out.println("#" + t + " " + answer);
        }
    }
}
