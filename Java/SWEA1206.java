import java.io.*;
import java.util.*;

public class SWEA1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            int result = 0;
            for (int i = 0; i < N; i++) {
                int x = Integer.parseInt(st.nextToken());
                list.add(x);
                if (list.size() == 5) {
                    int a = Math.max(list.get(0), list.get(1));
                    int b = Math.max(list.get(3), list.get(4));
                    int max = Math.max(a, b);
                    
                    if (list.get(2) > max) {
                        result += list.get(2) - max;
                    }
                    list.remove(0);
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
