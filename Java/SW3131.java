import java.io.*;

class SW3131 {
	
	public static void main(String[] args) throws IOException {
		int N = 1000000;
		boolean[] prime = new boolean[N+1];
		
		prime[0] = prime[1] = true;
		
		for (int i = 2; i < Math.sqrt(N); i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= N; j+=i) {
					prime[j] = true;
				}
			}
		}
		
		for (int i = 1; i <= N; i++) {
			if (!prime[i]) {
				System.out.print(i + " ");
			}
		}
	}
}