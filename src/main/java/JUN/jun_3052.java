package JUN;

import java.util.Scanner;

public class jun_3052 {
        public static void main(String[] args) {


            Scanner sc =new Scanner(System.in);
            int[] arr = new int[10];
            String[] str = new String[10];
            int sum =0;

            for (int i=0; i < 10; i++){
                int a = sc.nextInt();

                arr[i] = a;
                /*System.out.println(arr[i]);*/
                int b = a%42;
                String res = String.valueOf(b); //굳이 문자열로 바꿀 필요 없다.
                str[i] = res;


            }



        }
    }

