package test_prepare;

import java.util.Scanner;

// 입력받은 숫자가 3의 배수인지, 5의 배수인지, 둘 다 만족하는지 작성
public class if_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();

        if(a%15==0){
            System.out.println("3과 5의 배수입니다.");
        }else if(a%5==0){
            System.out.println("5의 배수입니다.");
        }else if(a%3==0){
            System.out.println("3의 배수입니다.");
        }
    }
}
