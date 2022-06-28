package alone;

import java.util.Scanner;

public class programmers05 {
    public static void main(String [] args) {
        programmers05 p5=new programmers05();
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        p5.solution(num);

    }
    public String solution(int num) {
        return (num%2==0)? "Even":"Odd";

    }

}


