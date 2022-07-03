package alone;

import java.util.Scanner;

public class programmers08 {
    public static void main(String[] args) {
        programmers08 p8 = new programmers08();
        Scanner sc = new Scanner(System.in);
        String new_id = sc.nextLine();
        p8.solution(new_id);
    }


    public String solution(String new_id) {
        // 1단계. 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계. 소문자 숫자 - _ . 제외한 모든 문자 제거
        String id = "";
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i); //한문자식 읽기

            if (ch >= 'a' && ch <= 'z') {
                id += String.valueOf(ch); //String으로 ch 값 넣어준다.
            } else if (ch >= '0' && ch <= '9') {
                id += String.valueOf(ch);
            } else if (ch == '-' || ch == '_' || ch == '.') {
                id += String.valueOf(ch);
            }
        }

        //3단계. .2번이상 연속된 부분을 . 하나로 치환
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) == '.') {
                int j = i + 1;
                String dot = ".";

                while (j != id.length() && id.charAt(j) == '.') {
                    dot += '.';
                    j++;
                }

                if (dot.length() > 1) {
                    id = id.replace(dot, "."); //.으로 치환
                }
            }
        }

        //4단계. .이 처음이나 끝에 있다면 제거
        if (id.startsWith(".")) { //처음에 . 있는가?
            id = id.substring(1, id.length()); //1번째 인덱스부터 끝까지 자르기. 즉, 처음 제거
        } else if (id.endsWith(".")) { //마지막에 . 있는가?
            id = id.substring(0, id.length() - 1); //처음부터 최종 -1 인덱스까지 자르기. 즉, 마지막 제거
        }

        //5단계. 빈 문자열이라면 "a" 대입
        if (id.length() == 0) {
            id += "a";
        }

        //6단계. 길이 16자 이상이면 첫 15개 문자 제외 나머지 제거.
        if (id.length() >= 16) {
            id = id.substring(0, 15);
        }

        // 제거 후 .이 끝에 있다면 . 제거
        if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }


        //7단계. id가 2자 이하면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임.
        String last = id.charAt(id.length() - 1) + "";
        if (id.length() == 2) {
            id = id + last;
        } else if (id.length() == 1) {
            id = id + last + last;
        }
        return id;
    }
}

