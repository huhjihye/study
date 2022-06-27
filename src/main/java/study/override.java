package study;

class Woman{
    public String name;
    public int age;

    //info()메서드
    public void info(){
        System.out.println("여자의 이름은"+name+"이고, 나이는"+age+"입니다.");
    }
}

class Job extends Woman{
    String job;

    public void info(){
        System.out.println("여자의 직업은"+job+"입니다.");
    }
}

public class override{
    public static void main(String[] args){
        Job job = new Job();

        // 부모클래스를 상속받았으므로 자식클래스 내 별도 선언 없이 부모클래스 내 멤버변수에 접근 가능
        job.name="유리";
        job.age=20;
        job.job="프로그래머";

        // 호출
        job.info();


    }
}