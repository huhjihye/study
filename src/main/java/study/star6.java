package study;

import java.util.Scanner;

//마름모
//   *
//  ***
// *****
//  ***
//   *
public class star6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int a=1; a<=(i*2)-1;a++){
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=n; i>=1;i--){
            for (int j=0; j<(n-i);j++){
                System.out.print(" ");
            }
            for(int a=1; a<=(i*2)-1; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}