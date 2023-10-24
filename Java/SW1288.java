import java.io.*;
import java.util.*;

public class SW1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            String s;
            while (true) {
                cnt++;
                int answer = 0;
                answer = n * cnt;

                s = Integer.toString(answer);
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    int x = c -'0';
                    set.add(x);
                }
                if (set.size() == 10) {
                    break;
                }
            }
            System.out.println("#" + i + " " + s);
        }
    }
}
