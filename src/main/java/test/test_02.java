package test;
class Overloading{ //오버로딩 예제
    public void same(int param){
        System.out.println("숫자를 출력하는 함수 입니다.");
    }
    public void same(String param){
        System.out.println("문자를 출력하는 함수 입니다.");
    }
}
public class test_02 {
    public static void main(String[] args) {
        Overloading o =new Overloading();
        o.same(1);
        o.same("one");
    }
}
