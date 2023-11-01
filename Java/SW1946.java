import java.io.*;
import java.util.*;

public class SW1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            String[][] graph = new String[201][10];
            int x = 0; int y = 0;
            int sum = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = String.valueOf(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sum += b;
                while (true) {
                    if (b == 0) break; 
                    graph[x][y] = a;
                    b--;
                    y++;
                    if (y == 10) {
                        y = 0;
                        x++;
                    }
                }
            }

            if (sum % 10 != 0) {
                sum = (sum / 10) + 1;
            } else sum = (sum / 10);
            System.out.println("#" + t);
            for (int i = 0; i < sum; i++) {
                for (int j = 0; j < 10; j++) {
                    if (graph[i][j] != null) {
                        sb.append(graph[i][j]);
                    } else {
                        break;
                    }

                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
