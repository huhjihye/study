package alone;

import java.util.Scanner;

public class startends_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;

        System.out.println("문자열 입력 ==> ");
        str=sc.nextLine();

        System.out.println("출력 문자열 ==> ");

        if(!str.startsWith("(")){
            System.out.println("(");
        }
    }
}
