import java.io.*;
import java.util.*;

class SW8500 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			int answer = 0;
			for (int i = 0; i < N; i++) {
				answer += arr[i]+1;
			}
			answer += arr[N-1];
			System.out.println("#" + t + " " + answer);
		}
 	}
}