package JUN;

import java.util.Scanner;

public class jun_for_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();

        for (int i = 1; i <= c; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a + b);
        }

    }

}