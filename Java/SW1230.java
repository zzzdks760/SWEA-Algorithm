import java.io.*;
import java.util.*;

public class SW1230 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine()); //첫번째줄
            List<Integer> list = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < N; i++) {    
                list.add(Integer.parseInt(st.nextToken()));
            }
            int M = Integer.parseInt(br.readLine()); //세번째줄
            st = new StringTokenizer(br.readLine()); //네번째줄

            while (st.hasMoreTokens()) {
                String cmd = st.nextToken();  
                if (cmd.equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < y; j++) {
                        list.add(x, Integer.parseInt(st.nextToken()));
                        x++;
                    }

                } else if (cmd.equals("D")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    
                    for (int j = 0; j < y; j++) {
                        list.remove(x);
                    }

                } else if (cmd.equals("A")) {
                    int y = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < y; j++) {
                        list.add(Integer.parseInt(st.nextToken()));
                    }
                } 
            }
            sb.append("#").append(t).append(" ");
            for (int i = 0; i < 10; i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}