package alone;
//두 정수 left와 right가 매개변수로 주어집니다.
// left부터 right까지의 모든 수들 중에서,
// 약수의 개수가 짝수인 수는 더하고,
// 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
public class programmers01 {

    public int solution(int left, int right){
        int answer =0;

        for(int i=left; i<=right;i++){ //매개변수로 받은 left 부터 right까지 for문 돌림
            int sum =1; // i의 약수 개수 더하기 , 1로 초기화 : 자기자신의 수 포함 시키기 위해

            for(int j=1; j<=i/2;j++){ //i/2 이후의 숫자들은 자기 자신의 수 i를 제외하면 약수가 없음.
                if(i%j==0){ //약수이면
                     sum++; // sum을 +1해줌
                }
            }
            answer +=sum%2 ==0 ? i: -i; // 짝수면 +1 해주고 아니면 -1해줌
        }
        return answer;

    }
}
