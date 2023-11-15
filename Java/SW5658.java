import java.io.*;
import java.util.*;

class SW5658 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			char[] c = br.readLine().toCharArray();
			
			TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
			for (int i = 0; i < N/4; i++) {
				char tmp = c[N-1];
				for (int j = N-1; j > 0; j--) {
					c[j] = c[j-1];
				}
				c[0] = tmp;
				
				for (int k = 0; k < N; k += N/4) {
					String s = "";
					for (int l = k; l < k + N/4; l++) {
						s += c[l];
					}
					set.add(s);
				}
			}
			String[] s = set.toArray(new String[set.size()]);
			int answer = Integer.parseInt(s[K-1], 16);
			System.out.println("#" + t + " " + answer);
		}
		
	}
}