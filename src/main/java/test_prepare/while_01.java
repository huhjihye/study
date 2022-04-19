package test_prepare;
//while문 구구단 3단과 5단에 <n단>표시
public class while_01 {
    public static void main(String[] args) {
        int dan=1;
        while(dan<10){
            if(dan==3 || dan==5){ //같이 3단과 5단이 실행안돼.. 그니까 || 연산자
                System.out.println(dan+" <단>");
            }
            int i=1;
            while(i<10){
                System.out.println(dan+"x"+i+"="+(dan*i));
                i++;
            }
            System.out.println();
            dan++;
        }

    }
}
