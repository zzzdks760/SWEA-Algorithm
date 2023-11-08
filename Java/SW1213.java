import java.io.*;

public class SW1213 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            String find_s = br.readLine();
            String s = br.readLine();
            char[] find_c = find_s.toCharArray();
            char[] c = s.toCharArray();
            int answer = 0;

            String tmp = "";
            for (int i = 0; i < (c.length)-(find_c.length-1); i++) {
                if (c[i] == find_c[0]) {
                    for (int j = i; j < i+find_c.length; j++) {
                        tmp += c[j];
                    }
                    if (tmp.equals(find_s)) {
                        answer++;
                    }
                    tmp = "";
                }
            }
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
}