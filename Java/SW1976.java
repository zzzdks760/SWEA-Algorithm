import java.io.*;
import java.util.*;

public class SW1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            
            //분
            m1 += m2;
            if (m1 >= 60) {
                m1 %= 60;
                h1+=1;
            }

            //시간
            h1 += h2;
            if (h1 >= 13) {
                if (h1 == 24) {
                    h1 = 12;
                } else {
                    h1 %= 12;
                }
            }
            sb.append(h1+ " " + m1);
            System.out.print("#" + t + " ");
            System.out.println(sb);
        }
    }
}