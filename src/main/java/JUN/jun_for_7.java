package JUN;

import java.util.Scanner;

public class jun_for_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Case #" + i + ": " + (a + b));
        }
    }
}
