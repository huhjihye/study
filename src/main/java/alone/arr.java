package alone;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aa[]= new int[5];
        int sum, count;

        System.out.printf("첫번째 값");
        aa[0]= sc.nextInt();
        System.out.printf("두번째 값");
        aa[1]=sc.nextInt();
        System.out.printf("세번째 값");
        aa[2]=sc.nextInt();
        System.out.printf("네번째 값");
        aa[3]=sc.nextInt();
        System.out.printf("다섯번째 값");
        aa[4]=sc.nextInt();


        count=aa.length;
         sum =aa[0]+aa[1]+aa[2]+aa[3]+aa[4];

        System.out.println(count+"배열의 수 ");
        System.out.println("배열의 전체 값의 합 "+ sum);
    }
}
