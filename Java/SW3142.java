import java.io.*;
import java.util.*;

class SW3142 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int one = 0;
			int two = 0;
			
			if (N > M) {
				two = N-M;
				one = M - two;
			} else if (N == M) {
				one = N;
			}
			System.out.println("#" + t + " " + one + " " + two);
		}
 	}
}