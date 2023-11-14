import java.io.*;
import java.util.*;

public class SW1240 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            String str = "";
            for (int i = 0; i < N; i++) {
                String s = String.valueOf(br.readLine());
                if (s.contains("1")) {
                    str = s;
                }
            }
            // System.out.println(Arrays.toString(arr));

            System.out.println("====================================");
            
            sb.append(str);
            sb.reverse();
            // System.out.println("삭제전: " + sb);
            
            //앞에서부터 0전부 삭제
            int idx = 0;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '0') {
                    idx++;
                } else {
                    break;
                }
            }
            sb.delete(0, idx);
            String s = sb.toString();
            int cnt = 0;
            String tmp = "";
            List<String> list = new ArrayList<>();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < sb.length(); i++) {
                tmp += s.charAt(i);
                if (cnt == 6) {
                    System.out.println("tmp: " + tmp);
                    //문자열 뒤집기
                    sb2.append(tmp);
                    sb2.reverse();
                    tmp = sb2.toString();
                    list.add(tmp);
                    tmp = "";
                    cnt = 0;
                    sb2.setLength(0);
                } else if (i == sb.length()-1) {
                    if (i == sb.length()-1) {
                        break;
                    }
                }
                cnt++;

                if (tmp.length() > 3 && tmp.contains("1") == false) {
                    break;
                }
            }
            System.out.println(list);

            //이진수로 변경

            int xsum = 0; //홀수 합
            int ysum = 0; //짝수 합
            for (int i = 1; i <= list.size(); i++) {
                int a = Integer.parseInt(list.get(i-1), 2);
                if (i % 2 != 0) {
                    xsum += a;
                } else {
                    ysum += a;
                }
            }
            System.out.println("홀수합: " + xsum);
            System.out.println("짝수합: " + ysum);

            int mulxsum = xsum * 3;
            int result = xsum + ysum;

            if (mulxsum + ysum % 10 == 0) {
                System.out.println("#" + t + " " + result);
            } else {
                System.out.println("#" + t + " " + 0);
            }
        }
    }
}
