package study;

public class while03 {
    public static void main(String[] args) {

        Loop1:for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    //break Loop1;
                    break;
                    //continue Loop1;
                    //continue;
                }
            }
            System.out.println("그냥 break, continue.....!");
        }
        System.out.println("이름 붙힌 break, continue!!!");
    }
}
