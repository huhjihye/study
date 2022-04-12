package JUN;

import java.io.*;
import java.util.StringTokenizer;

public class jun_for_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st;
        for ( ; ; ) {    //제한없이 all받기
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;    //if문에도 break 사용가능함.
            } else {
                bw.write(a + b + "\n");
            }

        }
        br.close();

        bw.flush(); //입력받은 모든거 다 꺼내주기
        bw.close();

    }
}
