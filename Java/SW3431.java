import java.io.*;
import java.util.*;

class SW3431 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int U = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			if (L <= X && U >= X) {
				answer = 0;
			} else if (L > X) {
				answer = L-X;
			} else if (U < X) {
				answer = -1;
			}
			System.out.println("#" + t + " " + answer);
		}
 	}
}