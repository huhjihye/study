package JUN;

import java.util.Scanner;

public class jun_for_1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int i = s.nextInt();
        int j =1;

        System.out.println(i);

        for( j=1 ; j<10 ; j++){
            System.out.println(i + "x" + j + "=" + i*j);
        }

    }


}
