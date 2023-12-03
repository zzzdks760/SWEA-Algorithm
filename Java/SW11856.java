import java.io.*;
import java.util.*;

public class SW11856 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String s = br.readLine();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            if (c[1] == c[2]) {
                System.out.println("#" + t + " " + "No");
            }
            else if (c[0] == c[1] && c[2] == c[3]) {
                System.out.println("#" + t + " " + "Yes");
            }
            else {
                System.out.println("#" + t + " " + "No");
            }
        }
    }
}
