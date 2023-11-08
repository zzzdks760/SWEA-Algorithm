import java.io.*;
import java.util.*;

public class SW1217 {
    static StringBuilder sb = new StringBuilder();

    static int answer;
    static int B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            answer = 1;

            mul(A, 1);

            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }    

    static void mul(int a, int b) {
        if (b == B+1) {
            return;
        }

        answer *= a;
        mul(a, b+1);
    }
}