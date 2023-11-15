import java.io.*;
import java.util.*;

class SW2817 {
	static int N, K, answer;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			answer = 0;
			
			dfs(0, 0);
			System.out.println("#" + t + " " + answer);
		}
	}
	
	static void dfs(int idx, int sum) {
		
		if (sum == K) {
			answer++;
			return;
		}
		if (sum > K) {
			return;
		}
		if (N == idx) {
			return;
		}
		
		dfs(idx+1, sum + arr[idx]);
		dfs(idx+1, sum);
		
	}
}