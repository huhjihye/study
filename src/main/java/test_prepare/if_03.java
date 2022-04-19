package test_prepare;

import java.util.Scanner;

public class if_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("연도를 입력하세요 : ");
        int i=sc.nextInt();

        if((i%4==0)&&(i%100!=0)||(i%400==0)){
            System.out.println(i+" 년은 윤년입니다.");
        }
    }
}
