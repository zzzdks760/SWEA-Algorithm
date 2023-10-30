import java.io.*;
 
public class SW1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
 
        for (int i = 1; i <= N; i++) {
            String s = Integer.toString(i);
            boolean has369 = false;
 
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
 
                if (c == '3' || c == '6' || c == '9') {
                    sb.append("-");
                    has369 = true;
                }
            }
 
            if (!has369) {
                sb.append(s);
            }
            sb.append(" ");
        }
        System.out.print(sb);
    }
}