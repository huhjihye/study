package JUN;

import java.io.*;
import java.util.StringTokenizer;

public class jun_for_8 {
    public static void main(String[] args) throws IOException { //예외값 걸러내기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //String을 Int로 강제변환


        StringTokenizer st; //선언하기
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        br.close();

        bw.close();
        bw.close();
    }
}
