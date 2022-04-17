package study;

public class arr9 {
    public static void main(String[] args) {
        String a,b,c;
        int[] arr=new int[10];
        a= "12345";
        b= "54321";
        c= "45678";

        String result =a+b+c;
        System.out.println(result);

        for(int i =0; i<arr.length; i++){
            arr[result.charAt(i)-'0']++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
