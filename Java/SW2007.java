import java.io.*;

public class SW2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String s = br.readLine();
            int cnt = 0; //문자열길이
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(0) == s.charAt(j)) {
                    if (s.substring(0, j).equals(s.substring(j, j+j))) {
                        cnt = j;
                        break;
                    }
                }
            }
            System.out.println("#" + i + " " + cnt);
        }
    }
}