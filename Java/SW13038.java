import java.io.*;
import java.util.*;

class SW13038 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[7];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int min = Integer.MAX_VALUE;
			
			for (int i = 0; i < 7; i++) {
				if (arr[i] == 1) {
					int start = i;
					int cnt = 0;
					
					while (true) {
						if (arr[start%7] == 1) {
							cnt++;
						}
						start++;
						
						if (cnt == N) {
							min = Math.min(min, start-i);
							break;
						}
					}
				}
			}
			System.out.println("#" + t + " " + min);
		}
	}
}