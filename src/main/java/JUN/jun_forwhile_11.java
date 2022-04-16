package JUN;

import java.util.Scanner;

public class jun_forwhile_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a<y){
                System.out.print(a+" ");
            }

        }
    }
}
