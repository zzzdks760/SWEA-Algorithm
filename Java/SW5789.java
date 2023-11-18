import java.io.*;
import java.util.*;

class SW5789 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int[] arr = new int[N+1];
			int n = 0;
			
			for (int i = 0; i < Q; i++) {
				n++;
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				for (int j = x; j <= y; j++) {
					arr[j] = n;
				}
			}

			sb.append("#").append(t).append(" ");
			for (int i = 1; i <= N; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}