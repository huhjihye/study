package JUN;

import java.util.Scanner;

public class jun5_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();  //시간
            int b = sc.nextInt();  //분
            int c = sc.nextInt();  //조리 시간

            int y = b+c;     //분 +조리시간 합산

            a = a+(y/60);
            b = y%60;
            if (a == 24) {
                a = 0;
            }else if(a >=25){
                a-=24;

            }
            System.out.println(a + " " + b);
        }
    }


