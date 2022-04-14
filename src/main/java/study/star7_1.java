package study;

import java.util.Scanner;

public class star7_1 {
    public static void main(String[] args) {
        int i, j, st, end;// 변수 4개 선언
        Scanner src = new Scanner(System.in);
        System.out.println("값을 입력해 주세요");
        int all = src.nextInt();
        st = 1; // 별찍기 시작값을 1로
        end = all; // 별찍기 끝값을 5로

        for (i = 1; i <= all; i++) { //i는 1~all까지 행 생성
            for (j = 1; j <= end; j++) { // j는 end 값까지 열 생성
                if(j<st) { // j가 시작값보다 작다면
                    System.out.print(" "); // 공백을 출력
                }else if (j <= end) { // j가 end값과 작거나 같으면
                    System.out.print("*"); // 별 출력
                }else { // 둘다 아니면
                    System.out.print(" "); // 공백 출력
                }
            }
            System.out.println(); // 줄바꿈
            if (i < all/2+1){ // i가 중앙값 무조건
                st++; // 시작값 증가
                end--; // 종료값 감소
            } else { // 아니면
                st--; // 시작값 감소
                end++; // 종료값 증가
            }
        }
    }
}
