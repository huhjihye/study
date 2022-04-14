package study;

import java.util.Scanner;

public class star6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int a = sc.nextInt();

        int st = a / 2 ;
        int end = a / 2 + 1;

        for (i = 1; i <=a; i++) {
            for (j = 1; j <=end; j++) {
                if (j <= st) {
                    System.out.print(" ");
                } else if (j <= end) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i < a/2+1) {
                st--;
                end++;
            }else{
                st++;
                end--;
            }
            System.out.println();
        }
    }
}
