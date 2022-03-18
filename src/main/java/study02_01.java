import java.util.Scanner;

public class study02_01 {

    public static void main (String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("값을 입력하세요:");
        int inputNum = in.nextInt();
        System.out.print("입력받은 값: "+ inputNum);
    }
}

// 숫자를 입력받을 때 int 문자로 입력받을 떄 nextLine();
