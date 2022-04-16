package JUN;

import java.util.Scanner;

public class jun_forwhile_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        if(a<10){
            a*=10;
        }
        int i=0; //첫째
        int j=0; //둘째
        int n=0;
        int sum=a;

        while(true){
            i =sum/10;
            j=sum%10;
            sum=i+j;

            sum=j*10 + sum%10;
            n++;
            if(sum==a)
                break;
        }

    }
}
