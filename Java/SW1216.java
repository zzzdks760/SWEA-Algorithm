import java.io.*;

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
                        String x = sb.toString();
                        String y = sb.reverse().toString();

                        sb2.append(graph[k][i]);
                        String x2 = sb2.toString();
                        String y2 = sb2.reverse().toString();

                        if (x.equals(y)) {
                            max = Math.max(max, x.length());
                        }

                        if (x2.equals(y2)) {
                            max2 = Math.max(max2, x2.length());
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