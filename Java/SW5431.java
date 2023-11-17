import java.io.*;
import java.util.*;

class SW5431 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			boolean[] check = new boolean[N+1]; 
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < K; i++) {
				int x = Integer.parseInt(st.nextToken());
				check[x] = true;
			}

			sb.append("#").append(t).append(" ");
			for (int i = 1; i <= N; i++) {
				if (!check[i]) {
					sb.append(i).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}