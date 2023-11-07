import java.io.*;

public class SW1289 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String s = br.readLine();
            char x = '0'; //기준
            int result = 0; //총합

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != x) { //기준이 다를경우
                    if (x == '1') {
                        x = '0';
                    } else {
                        x = '1';
                    }
                    result++;
                }

            }
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
