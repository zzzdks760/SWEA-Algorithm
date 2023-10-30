import java.io.*;

public class SW2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] before = new int[N+1];
            int[] after = new int[N+1];
            System.out.println("#" + t);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        after[j] = 1;
                    } else {
                        after[j] = before[j-1] + before[j];
                    }
                }
                for (int k = 0; k < N; k++) {  
                    if (after[k] != 0) {
                        before[k] = after[k];
                        System.out.print(before[k]);
                    } else {
                        break;
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }    
}