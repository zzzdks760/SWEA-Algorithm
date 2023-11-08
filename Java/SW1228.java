import java.io.*;
import java.util.*;

public class SW1228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int t = 1; t <= 10; t++) {
            List<Integer> list = new LinkedList<>();
            int N = Integer.parseInt(br.readLine()); //첫번째 줄
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) { 
                list.add(Integer.parseInt(st.nextToken())); //두번째 줄
            }
            int M = Integer.parseInt(br.readLine()); //세번째 줄
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                if (st.nextToken().equals("I")) {
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());

                    for (int j = 0; j < y; j++) {
                        list.add(x, Integer.parseInt(st.nextToken()));
                        x++;
                    }
                }
            }
            System.out.print("#" + t + " ");
            for (int i = 0; i < 10; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
