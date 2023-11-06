import java.io.*;

public class SW1215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            char[][] graph = new char[8][8];
            int result = 0;

            for (int i = 0; i < 8; i++) {
                String s = br.readLine();
                for (int j = 0; j < 8; j++) {
                    graph[i][j] = s.charAt(j);
                }
            }
            // System.out.println(Arrays.deepToString(graph));

            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            //가로
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8-N+1; j++) {
                    for (int k = j; k < j+N; k++) {
                        sb.append(graph[i][k]);
                        sb2.append(graph[k][i]);
                    }
                    // System.out.println("sb: " + sb + " reSb: " + sb.reverse());
                    String tmp = sb.toString();
                    String reTmp = sb.reverse().toString();
                    if (tmp.equals(reTmp)) {
                        result++;
                    }

                    String tmp2 = sb2.toString();
                    String reTmp2 = sb2.reverse().toString();
                    if (tmp2.equals(reTmp2)) {
                        result++;
                    }
                    sb.setLength(0);
                    sb2.setLength(0);
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
