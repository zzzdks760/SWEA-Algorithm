import java.io.*;
import java.util.*;

public class SW13229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] day = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

        for (int t = 1; t <= T; t++) {
            String s = br.readLine();
            int answer = 0;

            for (int i = 0; i < 7; i++) {
                if (s.equals(day[i])) {
                    if (i == 6) {
                        answer = 7;
                    } else {
                        answer = 7 - i - 1;
                    }
                }
            }
            System.out.println("#" + t + " " + answer);
        }
    }
}
