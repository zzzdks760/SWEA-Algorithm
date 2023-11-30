import java.io.*;

public class SW14692 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            String s = "";
            if (N % 2 == 0) {
                s = "Alice";
            } else {
                s = "Bob";
            }
            System.out.println("#" + t + " " + s);
        }
    }
}
