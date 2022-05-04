package framework_study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set01 {
    public static void main(String[] args) {
        Set<String>set =new HashSet<>();

        //Set 객체에 데이터 추가하기
        set.add("댕댕이");
        set.add("흰둥이");
        set.add("강냉이");
        set.add("강냉이");
        set.add("토끼");
        set.add("당근");  //중복 데이터 저장 여부 확인을 위한 중복 추가

        int setSize =set.size();
        System.out.println("Set에 저장한 데이터의 크기 :  " +setSize);

        System.out.println("for Each문을 사용해 Set 객체에 저장된 데이터 출력");
        for(String name :set) {
            System.out.println("이름 :  " + name);
        }
        System.out.println("람다식을 사용해 Set 객체에 저장된 데이터 출력");
        set.forEach(name -> System.out.println("name : "+name));

        System.out.println("List에 저장했던 데이터를 Interator 객체를 통해 while문으로 출력");
        Iterator<String>it =set.iterator();
        while(it.hasNext()){
            String name =it.next();
            System.out.println("이름 : "+name);
        }


    }
}
