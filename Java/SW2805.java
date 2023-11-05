import java.io.*;

public class SW2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            int left = N/2, right = N/2;

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = left; j <= right; j++) {
                    sum += (int) s.charAt(j) - '0';
                }
                
                if (i < N/2) {
                    left--;
                    right++;
                } else {
                    left++;
                    right--;
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}