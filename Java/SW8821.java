import java.io.*;

class SW8821 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String s = br.readLine();
			int[] arr = new int[10];
			int answer = 0;
			
			for (int i = 0; i < s.length(); i++) {
				int x = (int)s.charAt(i)-'0';
				arr[x]++;
			}
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					answer++;
				}
			}
			System.out.println("#" + t + " " + answer);
		}
 	}
}