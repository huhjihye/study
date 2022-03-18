// 분기문 설명   if
// 만약 이 조건이 참이면 프로그램을 실행해라.
// if (조건){         소괄호(조건)이 true 일 경우만 실행
// 실행할 코드
// }

// else 사용(위에 if가 모두 아니라면)

//문자끼리 비교하려면 = 사용이 아니라 .equals를 사용


import java.util.Scanner;

public class study02_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  //스케너 객체 사용을 위한 선언 초기화
        String name = "허지혜";
        System.out.println("이름을 입력하세요: ");
        String id = in.nextLine();
        if(name.equals(id)){
            System.out.println("단 입력 : ");
            int num = in .nextInt();
            System.out.println(num +"단 시작");
            int a = num;
            int c = 0;
            System.out.println(a +"단");
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);
            System.out.println(a +"x" + ++c + "=" +a*c);



        }


    }

}





