import java.io.*;
import java.util.*;

class SW14178 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			while (N > 0) {
				N -= D*2+1;
				answer++;
			}
			System.out.println("#" + t + " " + answer);
		}
	}
}