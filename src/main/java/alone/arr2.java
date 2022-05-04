package alone;

import java.util.ArrayList;
import java.util.List;

public class arr2 {
    public static void main(String[] args) {
        List<String>list =new ArrayList<>();

        list.add("허지혜");
        list.add("임상원");
        list.add("안녕~");

        int listSize = list.size();

        for(int i =0; i<listSize; i++){
            System.out.println("이름 : "+ list.get(i));
        }
    }
}
