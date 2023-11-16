import java.io.*;

class SW13428 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			String s = Integer.toString(N);
			char[] c = s.toCharArray();
			int max = Integer.parseInt(s);
			int min = Integer.parseInt(s);
			
			for (int i = 0; i < s.length()-1; i++) {
				for (int j = i+1; j < s.length(); j++) {
					char tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
					
					if (c[0] != '0' && min > Integer.parseInt(String.valueOf(c))) {
						min = Integer.parseInt(String.valueOf(c));
					}
					
					if (c[0] != '0' && max < Integer.parseInt(String.valueOf(c))) {
						max = Integer.parseInt(String.valueOf(c));
					}
					c[j] = c[i];
					c[i] = tmp;
				}
			}
			System.out.println("#" + t + " " + min + " " + max);
		}
	}
}