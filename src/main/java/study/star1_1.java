package study;

import java.util.Scanner;

public class star1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            b--;
        }
    }
}
