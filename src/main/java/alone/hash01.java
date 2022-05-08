package alone;

import java.util.Hashtable;

public class hash01 {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable(3);

        ht.put("huh","huh is cute");
        ht.put("won","won is pretty");
        ht.put("mi","mi is good");
        ht.put("lim","lim is so cute");

        //존재하는 데이터 검색
        System.out.println(ht.get("huh"));
        System.out.println(ht.get("won"));
        System.out.println(ht.get("mi"));
        System.out.println(ht.get("lim"));

        //존재하지 않는 데이터 검색
        System.out.println(ht.get("mimi"));

        //기존 데이터 덮어쓰기
        ht.put("lim","lim is sexy");
        System.out.println(ht.get("lim"));

    }

}

