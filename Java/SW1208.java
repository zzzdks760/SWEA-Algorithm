import java.util.*;
import java.io.*;

public class SW1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            
            int idx1 = 1;
            int idx2 = 1;
            //뒤에서
            
            while (N > 0) {
                for (int i = 0; i < 100; i++) {
                    if (arr[99] > arr[99-idx1]) {
                        arr[99]--;
                        break;
                    }

                    if (arr[99] == arr[99-idx1]) {
                        idx1++;
                        if (arr[99] > arr[99-idx1]) {
                            arr[99-idx1+1]--;
                            break;
                        }
                    }
                }

                for (int i = 0; i < 100; i++) {
                    if (arr[0] < arr[0+idx2]) {
                        arr[0]++;
                        break;
                    }

                    if (arr[0] == arr[0+idx2]) {
                        idx2++;
                        if (arr[0] < arr[0+idx2]) {
                            arr[0+idx2-1]++;
                            break;
                        }
                    }
                }
                idx1 = 1; idx2 = 1;
                N--;
            }
            int result = arr[99] - arr[0];
            System.out.println("#" + t + " " + result);
        }
    }
}