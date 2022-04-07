package JUN;

import java.util.Scanner;

public class jun_for_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
