import java.io.*;

public class SW1986 {
    public static void main(String[] args) throws IOException {
        //홀수는 + 짝수는 -
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            for (int j = 1; j <= n; j++) {
                if (j % 2 != 0) {
                    result += j;
                } else {
                    result -= j;
                }
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
