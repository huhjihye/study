package alone;

import java.util.HashSet;
import java.util.Set;
//배열에 중복된 데이터를 제거하고 데이터 출력하기
public class set01 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20};

        int i;

        Set<Integer> set = new HashSet<Integer>();



        System.out.println("데이터" + "\t" + "set삽입");

        for(i=0; i<arr.length; i++) {

            System.out.println(arr[i] + "\t" + (set.add(arr[i])?"true":"중복데이터"));

        }



        System.out.println("set" + set);

    }
}
