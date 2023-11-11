import java.io.*;
import java.util.*;

public class SW2814 {
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static boolean[] visited;
    static int N, M, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            graph = new int[N+1][N+1];
            visited = new boolean[N+1];
            answer = 0;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = graph[y][x] = 1; //정점 연결
            }

            for (int i = 1; i <= N; i++) {
                dfs(i, 1);
                visited[i] = false;
            }
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int idx, int cnt) {

        visited[idx] = true;

        for (int i = 1; i <= N; i++) {
            if (graph[idx][i] == 1 && !visited[i]) {
                dfs(i,cnt+1);
                visited[i] = false;
                
            }
        }
        answer = Math.max(answer, cnt);
    }
}