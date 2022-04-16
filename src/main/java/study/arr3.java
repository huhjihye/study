package study;

import java.util.Scanner;

//학생 5명의 점수를 입력 받고 학생 점수 총 합과 평균을 구하여라
public class arr3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int avg=0;
        int a =sc.nextInt();

        int[] arr= new int [a];

        for(int i=0; i<a;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg= sum/a;
        System.out.println("총점은? : "+ sum);
        System.out.println("평균 점수는? : "+ avg);
    }

}
