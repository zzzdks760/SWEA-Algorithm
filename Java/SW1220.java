import java.io.*;
import java.util.*;

public class SW1220 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 1; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] graph = new int[N][N];
            int answer = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            // System.out.println(Arrays.deepToString(graph));

            
            for (int i = 0; i < N; i++) {    
                boolean isOne = false; //1다음 2가 나오는지 확인
                for (int j = 0; j < N; j++) {
                    if (graph[j][i] == 1) {
                        isOne = true;
                    } else if (graph[j][i] == 2 && isOne) {
                        answer++;
                        isOne = false;
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
