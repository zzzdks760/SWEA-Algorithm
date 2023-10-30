import java.io.*;

public class SW1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] cost = {50000, 10000, 5000, 1000, 500, 100, 50, 10}; 

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println("#" + t);

            for (int i = 0; i < cost.length; i++) {
                if (cost[i] <= N) {
                    System.out.print(N / cost[i]);
                    N = N % cost[i];
                } else {
                    System.out.print("0");
                }
                System.out.print(" ");   
            }  
            System.out.println();
        }
    }
}
