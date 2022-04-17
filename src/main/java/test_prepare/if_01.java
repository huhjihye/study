package test_prepare;

import java.util.Scanner;

// 짝, 홀수 판단
public class if_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();

        if(a%2==0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }

    }
}
