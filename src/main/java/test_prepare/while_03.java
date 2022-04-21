package test_prepare;

public class while_03 {
    public static void main(String[] args) {
        int dan=2;
        int i=1;
        while(dan<10){
            if(dan%3==0){
                System.out.println(dan+"단입니다");
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
