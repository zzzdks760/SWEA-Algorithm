import java.io.*;
import java.util.*;

class SW1860 {
	static int N, M, K;
	static boolean possible;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); //인원
			M = Integer.parseInt(st.nextToken()); //시간
			K = Integer.parseInt(st.nextToken()); //개수
			List<Integer> list = new ArrayList<>();
			possible = true;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(list);
			
			for (int i = 0; i < list.size(); i++) {
				int time = list.get(i);
				int sum = (time/M) * K;
				if (sum < i+1) {
					possible = false;
					break;
				}
			}
			
			if (possible) {
				System.out.println("#" + t + " " + "Possible");
			} else {
				System.out.println("#" + t + " " + "Impossible");
			}
		}
	}
}
