package JUN;

import java.io.*;
import java.util.StringTokenizer;

public class jun_for_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=1; i<=n; i++){
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            bw.write("Case #"+ i + ": "+(a+b)+"\n");
        }

        br.close();
        bw.close();





    }








}





