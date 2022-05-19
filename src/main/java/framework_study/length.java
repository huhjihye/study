package framework_study;

import java.util.ArrayList;

public class length {
    public static void main(String[] args) {
        int[] lengthTest1=new int[7];
        System.out.println(lengthTest1.length); //length 는 배열의 길이를 알고자 할때 사용된다.

        String lengthTest2 ="lengthSizeTest";
        System.out.println(lengthTest2.length());  //length()는 문자열의 길이를 알고자 할때 사용된다.

        ArrayList<Object> sizeTest =new ArrayList<>(); //size()는 컬렉션프레임워크 타입의 길이를 알고자 할 때 사용된다.
        System.out.println(sizeTest.size()); //0
    }
}
