import java.io.*;

class SW14555 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			char[] c = br.readLine().toCharArray(); 
			int answer =0;
			
			char tmp = c[0];
			for (int i = 1; i < c.length; i++) {
				if (tmp == '|' && c[i] == ')' || tmp == '(' && c[i] == '|' || tmp == '(' && c[i] == ')') {
					answer++;
				}
				tmp = c[i];
			}
			System.out.println("#" + t + " " + answer);
		}
 	}
}