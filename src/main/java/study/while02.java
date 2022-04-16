package study;
//while문으로 구구단
//while 문은 증감연산자를 어디서 어떻게 쓰는지가 관건

public class while02 {
    public static void main(String[] args) {


        int i = 2;
        int j = 1;
        while (i < 10) {
            while (j < 10) {
                System.out.println(i + "x" + j + "=" + i * j);
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }

    }
}
