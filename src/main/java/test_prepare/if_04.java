package test_prepare;

public class if_04 {
    public static void main(String[] args) {
        for(int i =1;i<10;i++){
            if((i==3) ||(i==5)){
                System.out.println(i+"단 입니다");
            }
            for(int j=1;j<10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }

    }
}
