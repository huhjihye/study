package alone;

import java.util.Scanner;

public class metod_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;

        System.out.println("문자열 입력 :");
        str=sc.nextLine();

        System.out.println("출력 문자열 :");
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='0'){
               System.out.println("$");
           }else{
               System.out.println(str.charAt(i));
           }
       }
    }
}
