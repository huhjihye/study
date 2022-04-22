package study;

import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        String str ="Hello World";
        StringTokenizer st = new StringTokenizer(str, " ");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
