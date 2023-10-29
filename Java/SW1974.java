import java.io.*;
import java.util.*;

public class SW1974 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {

            int result = 1;
            int[][] graph = new int[9][9];
            for (int i = 0; i < 9; i++) {
                int sum = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                    //입력받을 때 가로줄 체크   
                    sum += graph[i][j];
                }
                if (sum != 45) {
                    result = 0;
                }
            }

            //세로줄 체크
            for (int i = 0; i < 9; i++) {
                int sum = 0;
                for (int j = 0; j < 9; j++) {
                    sum += graph[j][i];
                }
                if (sum != 45) {
                    result = 0;
                }
                // System.out.println("세로 "+ sum);
            }

            //9칸 체크
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j +=3) {
                    int sum = 0;
                    for (int x = i; x < i+3; x++) {
                        for (int y = j; y < j+3; y++) {
                            sum += graph[x][y];
                        }
                    }
                    if (sum != 45) {
                        result = 0;
                    }
                    // System.out.println("9칸 "+ sum);
                }
            }

            System.out.println("#" + t + " " + result);
        }
    }
}