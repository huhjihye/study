package test_prepare;
//1~100까지의 수 중에서 3의 배수와 5의 배수인 숫자만 출력하시오
public class for_03 {
    public static void main(String[] args) {
        for(int i=1;i<101;i++){
            if(i%15==0){
                System.out.println(i);
            }
        }
    }
}
