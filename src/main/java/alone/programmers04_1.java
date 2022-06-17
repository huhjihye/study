package alone;

public class programmers04_1 {
    public static void main(String[] args) {
        String str1 = "zerothreeonetwo";

        String str2 = str1
                .replace("zero","1")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five","5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");


        int i = Integer.parseInt(str2);

        System.out.println(str2);


    }
}
