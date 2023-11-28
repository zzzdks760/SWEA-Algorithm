import java.io.*;
import java.util.*;

class SW6692 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			double answer = 0;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				double x = Double.parseDouble(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				answer += x * y;
			}
			System.out.printf("#" + t + " " + "%.6f", answer);
		}
 	}
}