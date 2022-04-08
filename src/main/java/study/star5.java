package study;
//뒤집힌 역행 삼각형
//*****
// ****
//  ***
//   **
//    *
import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
