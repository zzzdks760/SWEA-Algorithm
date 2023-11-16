import java.io.*;
import java.util.*;

class SW1493 {
	public static void main(String[] args) throws IOException {
		
		int[][] map = new int[301][301];
		int number = 1;
		for (int i = 0; i <= 300; i++) {
			for (int j = i; j >= 0; j--) {
				map[i-j][j] = number;
				number++;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			
			int x_idx = 0, y_idx = 0;
			int x_idx2 = 0, y_idx2 = 0;
			
			for (int i = 0; i <= 300; i++) {
				for (int j = 0; j <= 300; j++) {
					if (map[i][j] == p) {
						x_idx = i;
						y_idx = j;
					}
					
					if (map[i][j] == q) {
						x_idx2 = i;
						y_idx2 = j;
					}
				}
			}
			
			int x_result = x_idx + x_idx2 + 1;
			int y_result = y_idx + y_idx2 + 1;
			
			System.out.println("#" + t + " " + map[x_result][y_result]);
		}
	}
}