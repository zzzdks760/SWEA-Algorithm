import java.io.*;
import java.util.*;

class SW9700 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double p = Double.parseDouble(st.nextToken());
			double q = Double.parseDouble(st.nextToken());
			String result = "YES";
			//s2가 크면 YES s1이 크면 NO
			//1. 8/10 올바른, 2/10뒤집어서, 5/10 올바른, 5/10뒤집어서 
			//2. 6/10 올바른, 5/10뒤집어서
			double s1 = (1-p) * q;
			double s2 = p*(1-q)*q;
			if (s1 >= s2) {
				result = "NO";
			}
			System.out.println("#" + t + " " + result);
		}
 	}
}