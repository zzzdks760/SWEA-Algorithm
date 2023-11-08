import java.io.*;
import java.util.*;

public class SW1216 {
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            char[][] graph = new char[100][100];

            for (int i = 0; i < 100; i++) {
                String s = br.readLine();
                for (int j = 0; j < 100; j++) {      
                    graph[i][j] = s.charAt(j);
                }
            }
            

            int max = 0, max2 = 0;
            for (int i = 0; i < 100; i++) { //행
                for (int j = 0; j < 100; j++) { //열
                    sb.setLength(0);
                    sb2.setLength(0);
                    for (int k = j; k < 100; k++) {
                        sb.append(graph[i][k]);
                        sb2.append(graph[k][i]);

                        if (sb.toString().equals(sb.reverse().toString())) {
                            max = Math.max(max, sb.toString().length());
                        }

                        if (sb2.toString().equals(sb2.reverse().toString())) {
                            max2 = Math.max(max2, sb.toString().length());
                        }
                        sb.reverse();
                        sb2.reverse();
                    }
                }
            }

            int answer = 0;
            answer = Math.max(max, max2);

            System.out.println("#" + t + " " + answer);
        }
    }
}