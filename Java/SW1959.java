import java.io.*;
import java.util.*;

public class SW1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[] A = new int[N];
            int[] B = new int[M];

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[j] = Integer.parseInt(st2.nextToken());
            }
            // System.out.println("A: " + Arrays.toString(A));


            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                B[j] = Integer.parseInt(st3.nextToken());
            }
            // System.out.println("B: " + Arrays.toString(B));

            int answer = 0;
            if (N < M) {
                for (int j = 0; j <= Math.abs(N-M); j++) {
                    int idx = 0;
                    int max = 0;
                    for (int k = 0; k < N; k++) {
                        max += A[k] * B[j+idx];
                        idx++;
                    }
                    answer = Math.max(answer, max);
                }
            } else if (N > M) {
                for (int j = 0; j <= Math.abs(N-M); j++) {
                    int idx = 0;
                    int max = 0;
                    for (int k = 0; k < M; k++) {
                        max += A[j+idx] * B[k];
                        idx++;
                    }
                    answer = Math.max(answer, max);
                }
            } else {
                for (int j = 0; j < N; j++) {
                    answer += A[j] * B[j];
                }
            }
            System.out.println("#" + i + " " + answer);
        }
    }
}
