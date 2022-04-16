package JUN;

import java.util.Scanner;

public class jun_arr_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int[]arr=new int[a];
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<a;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
    }
}
