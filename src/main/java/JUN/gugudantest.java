package JUN;

// 3단부터 9단까지
// 3의 배수일 경우 <dan입니다> 출력하기
public class gugudantest {
    public static void main(String[] args) {

        for (int dan = 3; dan < 10; dan++) {
            if (dan == 3 || dan == 5) {
                System.out.println("<" + dan + "입니다>");
            }

            for (int j = 1; j < 10; j++) {
                System.out.println(dan + "x" + j + "=" + (dan * j));

            }
        }

    }
}
