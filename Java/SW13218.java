import java.io.*;
import java.util.*;

class SW13218 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++ ) {
			int A = Integer.parseInt(br.readLine());
			
			System.out.println("#" + t + " " + A / 3);
		}
 	}
}