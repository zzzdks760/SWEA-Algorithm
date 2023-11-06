import java.io.*;
import java.util.*;

public class SW1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 8; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            while (true) {
                for (int i = 1; i <= 5; i++) {
                    int x = list.get(0)-i;
                    list.remove(0);
                    
                    if (x <= 0) {
                        list.add(0);
                        break;
                    } else {
                        list.add(x);
                    }
                }
                if (list.get(7) == 0) break;
            }
            
            for (Integer n : list) {
                sb.append(n + " ");
            }
            System.out.println("#" + t + " " + sb);
        }
    }
}
