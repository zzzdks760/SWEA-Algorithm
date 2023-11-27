import java.io.*;
import java.util.*;

class SW9831 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int K = Integer.parseInt(br.readLine());
			List<Integer> list = new LinkedList<>();
			int answer = 0;
			
			for (int i = 0; i < K; i++) {
				int N = Integer.parseInt(br.readLine());
				
				if (N != 0) {
					list.add(N);
				} else {
					list.remove(list.size()-1);
				}
				
			}
			
			for (int x : list) {
				answer += x;
			}
			
			System.out.println("#" + t + " " + answer);
		}
 	}
}