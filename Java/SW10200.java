import java.io.*;
import java.util.*;

class SW10200 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int max = Math.min(A,  B);
			int min = 0;
			if (max == 0) {
				min = 0;
			} else {
				if (N <= A + B) {
					min = Math.abs(N - (A + B));	
				} else {
					min = 0;
				}
			}
			
			
			System.out.println("#" + t + " " + max + " " + min);
		}
 	}
}