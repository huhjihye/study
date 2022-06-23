package test;

class Catfamily {
    public void makesound() {
        System.out.println("고양이과는 다양한 소리를 냅니다.");
    }
}
class Cat extends Catfamily{
    public void makesound(){
        System.out.println("고양이는 아용하고 울지요");
    }
}
class Tiger extends Catfamily{
    public static void main(String[] args) {
        System.out.println("호랑이는 어흥! 하고 울지요");
    }
}
public class test_04 {
    public static void main(String[] args) {
        Catfamily cf=new Catfamily();
        Cat mc=new Cat();
        Tiger mt=new Tiger();

        cf.makesound();
        mc.makesound();
        mt.makesound();


    }
}
