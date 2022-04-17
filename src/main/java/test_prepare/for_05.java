package test_prepare;
// 1~100까지 숫자 중 3의 배수 또는 5의 배수에 만족하는 숫자만 덧셈을 하도록 반복문과 조건절을 이용
public class for_05 {
    public static void main(String[] args) {

        int sum =0;

        for(int i=1;i<101;i++){
            if((i%3==0) ||(i%5==0)){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
