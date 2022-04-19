package test_prepare;

public class while_02 {
    public static void main(String[] args) {
        int dan=2;
        int i =1;
        while(dan<10){
            if((dan==5)||(dan==6)){
                System.out.println();
            }else{
                System.out.println("< "+dan+"단 >");
            }
            while(i<10){
                System.out.println(dan+"*"+i+"="+(dan*i));
                i++;
            }
            i=1;
            dan++;
            System.out.println();
        }
    }
}
