import java.io.*;

public class SW1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] graph = new int[N][N];

            System.out.println("#" + t);
            int x = 0, y = 0;
            int idx = 0;
            for (int i = 1; i <= N*N; i++) {
                graph[x][y] = i;
                int nx = x + dx[idx];
                int ny = y + dy[idx];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N || graph[nx][ny] != 0) {
                    idx = (idx+1) % 4;
                }
                x += dx[idx];
                y += dy[idx];
            }
            for (int i = 0; i < N; i++) {
                for (int j : graph[i]) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
