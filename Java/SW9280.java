import java.io.*;
import java.util.*;

class SW9280 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] cost = new int[N]; //비용
			int[] weight = new int[M]; //무게
			int[] p = new int[N]; //주차공간
			int answer = 0;
			
			Queue<Integer> q = new LinkedList<>();
			Queue<Integer> cq = new LinkedList<>();
			
			//주차 비용
			for (int i = 0; i < N; i++) {
				cost[i] = Integer.parseInt(br.readLine());
			}
			//차량 무게
			for (int i = 0; i < M; i++) {
				weight[i] = Integer.parseInt(br.readLine());
			}
			
			for (int i = 0; i < M*2; i++) {
				int x = Integer.parseInt(br.readLine());
				q.add(x);
			}
			
			int cnt = 0;
			while (!q.isEmpty()) {
				int num;
				
				if (cnt < N && !cq.isEmpty()) {
					num = cq.poll();
					
					for (int i = 0; i < N; i++) {
						if (p[i] == 0) {
							p[i] = num;
							answer += weight[num-1] * cost[i];
							cnt++;
							break;
						}
					}
				} else {
					num = q.poll();
					
					if (num > 0) {
						if (cnt < N) {
							for (int i = 0; i < N; i++) {
								if (p[i] == 0) {
									p[i] = num;
									answer += weight[num-1] * cost[i];
									cnt++;
									break;
								}
							}
						} else {
							cq.offer(num);
						}
					} else {
						for (int i = 0; i < N; i++) {
							if (p[i] == -1 * num) {
								p[i] = 0;
								cnt--;
							}
						}
					}
				}
			}
			
			
			
			System.out.println("#" + t + " " + answer);
		}
	}
}