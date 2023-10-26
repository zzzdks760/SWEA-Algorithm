import java.io.*;
import java.util.*;

public class SW1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] graph = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.println("#" + t);
            int idx1 = 0; int idx2 = N-1;
            while (true) {
                String s1 = "";
                for (int x = N-1; x >= 0; x--) {
                    s1 += graph[x][idx1];

                }
                s1 += " ";
                for (int y = N-1; y >= 0; y--) {
                    s1 += graph[idx2][y];
                }
                s1 += " ";
                for (int z = 0; z < N; z++) {
                    s1 += graph[z][idx2];
                }
                idx1++;
                idx2--;
                System.out.println(s1);
                if (idx1 >= N) break;
            }
        }
    }
}