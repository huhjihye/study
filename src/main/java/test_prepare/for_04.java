package test_prepare;
//10이하 자연수의 4의 배수를 제외한 합
public class for_04 {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<11;i++){
            if(i%4!=0){
                sum+=i;
            }

        }
        System.out.println(sum); //위치 잘생각하기
    }

}