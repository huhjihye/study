package alone;

import java.util.Scanner;

public class programmers03 {
    public static void main(String[] args) {
        programmers03 p3 = new programmers03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p3.solution(n);

    }

    public String solution(int n) {
        String answer = "";
        String a="수";
        String b="박";

        for(int i=0;i<n;i++){
            if(i%2==0){
                answer+=a;
            }else if(i%2==1){
                answer+=b;
            }
        }
        System.out.println(answer);
        return answer;

    }

}
