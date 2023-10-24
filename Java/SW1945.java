import java.io.*;

public class SW1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[5];

            while (true) {
                if (n == 1) {
                    break;
                } else if (n % 2 == 0) {
                    n /= 2;
                    arr[0]++;
                } else if (n % 3 == 0) {
                    n /= 3;
                    arr[1]++;
                } else if (n % 5 == 0) {
                    n /= 5;
                    arr[2]++;
                } else if (n % 7 == 0) {
                    n /= 7;
                    arr[3]++;
                } else if (n % 11 == 0) {
                    n /= 11;
                    arr[4]++;
                }
            }
            System.out.println("#" + i + " " + arr[0] +" "+ arr[1] +" "+ arr[2] +" "+ arr[3] +" "+ arr[4]);
        }
    }
}
