package study;
// 구구단 테스트
public class arr10 {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];

        for(int i=2;i<arr.length;i++){
            if(i%8==0){   //순서 중요
                break;
            }else if((i%2==0)){  //순서 중요
                System.out.println(i+"단 입니다.");
            }
            for(int j=1;j<arr.length;j++){

                arr[i][j]=i*j;

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
