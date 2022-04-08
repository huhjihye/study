package study;

public class star_work {
    public static void main(String[] args) {
        int a=7;
        int b=4;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=a;j++){
                if(j<b){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            a++;
            b--;
        }
    }

}
