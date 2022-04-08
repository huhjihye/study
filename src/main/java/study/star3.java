package study;
//왼쪽위가 직각인 삼각형, 뒤집한 순행 삼각형
//*****
//****
//***
//**
//*
import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=n; i>0 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
