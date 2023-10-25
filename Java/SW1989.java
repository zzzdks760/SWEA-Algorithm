import java.io.*;

public class SW1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String s = br.readLine();
            char[] c = s.toCharArray();
            int x = 1;

            for (int j = 0; j < s.length()/2; j++) {
                if (c[j] == c[s.length()-j-1]) {
                    continue;
                } else {
                    x = 0;
                    break;
                }
            }
            System.out.println("#" + i + " " + x);
        }
    }
}
