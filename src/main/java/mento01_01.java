public class mento01_01 {
    public static void main(String[] args) {  //전역변수(위에 선언을 보통 해놓는다.), 지역변수 차이점 확실히 알기
        for(int i =2; i<10; i++){  //외부 for문 : 행이라고 생각하기
            for(int j=1; j<10; j++){ //내부 for문 : 열이라고 생각하기
                System.out.println(i + "X" + j + "=" + i*j + "입니다");
            }
            System.out.println("");
        }
    }

}
