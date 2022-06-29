package alone;

import java.util.Scanner;

public class programmers06 {
    public static void main(String[] args) {
        programmers06 p6=new programmers06();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p6.solution(n);
    }


    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}