import java.util.Scanner;

public class jun5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        int X = B + C;

        if (X < 60) {
            System.out.println(A + " " + X);
        }
        if (A < 23 && X > 60) {
            A += (X / 60);
            B = (X % 60);
            if (A >= 24) {
                A = 0;
                System.out.println(A + " " + B);
            }
            System.out.println(A + " " + B);
        }
        if (A >= 23 && X >= 60) {
            A = 0;
            A += (X / 60);
            B = (X % 60);
            System.out.println(A + " " + B);
        }
    }
}
