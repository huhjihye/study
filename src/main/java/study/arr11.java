package study;

public class arr11 {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];

        Loop1: for(int i=2; i< arr.length;i++){
            if(i==8){
                break Loop1;
            }
            if(i%2==0){
                System.out.println(i+"단입니다.");
            }
            for (int j=1; j<arr.length; j++){
                arr[i][j] =i*j;
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
