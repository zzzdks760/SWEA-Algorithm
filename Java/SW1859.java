import java.util.*;
import java.io.*;

public class SW1859 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스
        
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] day = new int[N];

            for (int i = 0; i < N; i++) {
                day[i] = Integer.parseInt(st.nextToken());
            }
            //System.out.println(Arrays.toString(day));
            long price = 0;
            //뒤에서부터 --> 최대값 - 오늘가격
            int max = 0;
            for (int j = N-1; j >= 0; j--) {
                int today = day[j];
                if (max > today) {
                    price += max - today;
                } else {
                    max = today;
                }
            }
            System.out.printf("#%d " + price, t);
            System.out.println();
        }
    }
}