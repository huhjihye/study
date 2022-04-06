package JUN;

import java.util.Scanner;

public class jun1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //s 는 스캐너의 변수명 ,new연산자를 사용해서 스캐너를 메모리에 올려주겠다. //system.in-> 화면으로 입력을 받겠다.
        int a,b;

        a= s.nextInt();
        b= s.nextInt();

        if(a>b){
            System.out.println(">");
        } else if (a<b){
            System.out.println("<");
        }else {                     //else if문을 사용한다면  끝에는 else항상 써야함.
            System.out.println("==");
        }
    }
}
