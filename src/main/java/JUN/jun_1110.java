package JUN;

import java.util.Scanner;

public class jun_1110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();  //26이라 가정
        int sum=a;
        int count=0;

        while (true){
            int left=sum/10; // 26에서 10의 자리 2를 구하기  10을 나누고 몫을 구하기
            int right=sum%10; // 26에서 1의 자리 6을 구하기   10을 나누고 나머지를 구하기
            int b=left+right; // 10의 자리 1의 자리 각각 더하기  ex. 2+6=8  8구하기
            sum=(10*right)+(b%10); // 새로 만들어진 수 , 더한 숫자가 10의 자리면 1의자리만 넣기
            count++;  // 사이클이 몇번도는지 체크
            if(sum==a){  // 사이클을 돌다가 처음수와 같아지면 멈춤
                break;
            }

        }
        System.out.println(count);


    }
}
