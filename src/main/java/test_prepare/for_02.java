package test_prepare;
//2021쪽지시험 , 10이하의 자연수 중 3의 배수 출력
public class for_02 {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
