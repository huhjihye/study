package alone;

import java.util.ArrayList;
import java.util.List;

public class ramda {
    public static void main(String[] args) {
        List<String> aa= new ArrayList<>();

        aa.add("허지혜");
        aa.add("허지원");
        aa.add("황지미");

        aa.forEach(name -> System.out.println("name :"+ name));
        }

    }

