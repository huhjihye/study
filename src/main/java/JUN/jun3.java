package JUN;

import java.util.Scanner;

public class jun3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int x =s.nextInt();
        int y =s.nextInt();

        if(x>0 && y>0){
            System.out.println("1사분면");
        }else if(x<0 && y>0){
            System.out.println("2사분면");
        }else if(x<0 && y<0){
            System.out.println("3사분면");
        }else{
            System.out.println("4사분면");
        }

    }
}
