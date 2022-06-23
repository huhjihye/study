package test;
class calculator{ //오버라이딩 예제
    public void sum(int left, int right){
        System.out.println(left +right);
    }
}

class Overridingcalculator extends calculator{
    public void sum(int left, int right){
        System.out.println(left+right+"입니다.");
    }
}
//실행
public class test_03 {
    public static void main(String[] args) {
        Overridingcalculator c1 =new Overridingcalculator();
        c1.sum(10,20);
    }
}
