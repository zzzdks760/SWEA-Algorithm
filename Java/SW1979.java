import java.io.*;
import java.util.*;

public class SW1979 {
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int result = 0;
            map = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st2.nextToken());

                }
            }
            System.out.println(Arrays.deepToString(map));

        }
    }
}
