import java.io.*;

public class SW2806 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] graph;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());
            graph = new int[N][N];
            result = 0;
            dfs(0);
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int row) {
        if (N == row) {
            result++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isPromising(row, col)) {
                graph[row][col] = 1;
                dfs(row+1);
                graph[row][col] = 0;
            }
        }
    }

    static boolean isPromising(int currentRow, int currentCol) {
        //수직 체크
        for (int r = 0; r < currentRow; r++) {
            if (graph[r][currentCol] == 1) {
                return false;
            }
        }

        //좌 대각선 체크
        for (int r = currentRow-1, c = currentCol-1; r >= 0 && r < N && c >= 0 && c < N; r--, c--) {
            if (graph[r][c] == 1) {
                return false;
            }
        }

        //우 대각선 체크
        for (int r = currentRow-1, c = currentCol+1; r >= 0 && r < N && c >= 0 && c < N; r--, c++) {
            if (graph[r][c] == 1) {
                return false;
            }
        }
        return true;
    }
}
