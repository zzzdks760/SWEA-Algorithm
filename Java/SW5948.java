import java.io.*;
import java.util.*;

class SW5948 {
	
	static int[] arr;
	static int answer;
	static Set<Integer> set;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = new int[7];
			answer = 0;
			
			for (int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			set = new HashSet<>();

			dfs(0, 0, 0);

			List<Integer> list = new ArrayList<>(set);
			Collections.sort(list, Collections.reverseOrder());
			
			answer = list.get(4);
			System.out.println("#" + t + " " + answer);
		}
	}
	
	static void dfs(int idx, int sum, int sum_cnt) {
		
		if (idx == arr.length) {
			if (sum_cnt == 3) {
				set.add(sum);
			}
			return;
		}
		
		dfs(idx+1, sum+arr[idx], sum_cnt+1);
		dfs(idx+1, sum, sum_cnt);
	}
}