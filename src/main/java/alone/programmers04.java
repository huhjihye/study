package alone;

import java.util.Scanner;

class programmers04 {

    public static void main(String[] args) {
        programmers04 p4=new programmers04();
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        p4.solution(s);
    }
    public int solution(String s) {
        String []num={"0","1","2","3","4","5","6","7","8","9"}; //문자열로 숫자를 배열에 담기
        String[]num1={"zero","one","two","three","four","five","six","seven","eight","nine"}; //문자열로 영어숫자담기
        for(int i=0;i<10;i++){ //현재 숫자는 0~9까지 존재 하니까 0~9까지 반복문 돌리기
            s=s.replace(num1[i], num[i]); // 입력받은 문자열 s를 문자->숫자로 변환하기
        }
        int answer=Integer.parseInt(s); //문자열을 숫자로 변환시키는 함수
        System.out.println(answer); // 변환한 최종값을 출력해보기
        return answer;  //반환하기

    }

}