package test_prepare;
//while문을 활용해 구구단을 출력할 때, 3단과 5단 시작에 <단>출력
public class while2 {
    public static void main(String[] args) {
        int dan=2;
        int i=1;
        while(dan<10){
            if((dan==3)||(dan==5)){
                System.out.println("<" + dan +"단>");
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
