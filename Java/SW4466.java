import java.io.*;
import java.util.*;

class SW4466 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			int answer = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			for (int i = N-1; i >= N-K; i--) {
				answer += arr[i];
			}
			System.out.println("#" + t + " " + answer);
		}
 	}
}