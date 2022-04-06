package JUN;

import java.util.Scanner;

public class jun4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int H = s.nextInt();
        int M = s.nextInt();


        if (M < 45) {
            H -= 1;
            M = 60 - (45 - M);
            if(H<0){
                H=23;
                System.out.println(H + " " + M);
            }else{
                System.out.println(H + " " + M);
            }

        } else {
            M -= 45;
            System.out.println(H + " " + M);
        }
    }

}
