package test;

class person{
    String name;
    String job;
    int age;
    person(String name, String job, int age){
        this.name=name;
        this.job=job;
        this.age=age;
    }
}

class student extends person{
    int score;
    student(String name, String job, int age, int score){
        super(name,job,age);
        this.score=score;
    }
    void print(){
        System.out.println("이름 : " +name+"\n"+"직업: "+job+"\n"+"나이:"+age+"\n"+"연봉:"+score+"\n");

    }
}
class researcher extends person {
    int pay;

    researcher(String name, String job, int age, int pay) {
        super(name, job, age);
        this.pay = pay;
    }

    void print() {
        System.out.println("이름 : " + name + "\n" + "직업: " + job + "\n" + "나이:" + age + "\n" + "연봉:" + pay + "\n");
    }
}
public class test_01 {
    public static void main(String[]args){
        student s=new student("허지혜","개발자", 28,9800);
        s.print();
        researcher r =new researcher("허지원","식량연구원",21,8000);
        r.print();
    }
}
