import java.io.*;
import java.util.*;

public class SW1234 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            char[] c = st.nextToken().toCharArray();
            List<Integer> list = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                list.add((int)c[i] - '0');
            }

            int idx = 0, idx2 = 1;
            while (true) {
                if (list.get(idx) == list.get(idx2)) {
                    list.remove(idx);
                    list.remove(idx);
                    idx = 0; idx2 = 1;
                } else {
                    idx++; idx2++;
                }

                if (idx2 == list.size()) break;
            }
            
            sb.append("#").append(t).append(" ");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}