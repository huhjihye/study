package test_prepare;

import java.util.Scanner;

//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class star02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //중앙 별 갯수
        int k=0; //별 찍는 횟수

        for(int i=0;i<2*n-1;i++){
            if(i<n){
                k++;
            }else{
                k--;
            }
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
