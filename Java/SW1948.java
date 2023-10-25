import java.io.*;
import java.util.*;

public class SW1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] Month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s_month = Integer.parseInt(st.nextToken());
            int s_day = Integer.parseInt(st.nextToken());
            int e_month = Integer.parseInt(st.nextToken());
            int e_day = Integer.parseInt(st.nextToken());

            int result = 0;
            if (s_month == e_month) {
                    result += e_day - s_day + 1;
            } else {
                result += Month[s_month] - s_day + 1;
                int idx = 1;
                while (true) {
                    if (s_month + idx == e_month) {
                        result += e_day;
                        break;
                    } else {
                        result += Month[s_month + idx];
                        idx++;
                    }
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
