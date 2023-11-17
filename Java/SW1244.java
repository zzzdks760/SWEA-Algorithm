import java.io.*;
import java.util.*;

class SW1244 {
	static String[] arr;
	static int chance, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = st.nextToken().split("");
			chance = Integer.parseInt(st.nextToken());
			answer = 0;
			
			if (arr.length < chance) {
				chance = arr.length;
			}
			
			dfs(0, 0);
			System.out.println("#" + t + " " + answer);
		}
	}
	
	static void dfs(int idx, int cnt) {
		if (chance == cnt) {
			String result = "";
			for (String s : arr) {
				result += s;
			}
			answer = Math.max(answer, Integer.parseInt(result));
			return;
		}
		
		for (int i = idx; i < arr.length-1; i++) {
			for (int j = i+1; j <arr.length; j++) {
				
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				dfs(i, cnt+1);
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}





















