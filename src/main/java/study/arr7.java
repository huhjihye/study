package study;

public class arr7 {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,4,3,6,7,8,9,6,2,1};

        for(int i=0; i<arr.length-1;i++){   //비교할때는 전체에서 -1 번만 비교
            for(int j=0; j<arr.length-1-i;j++){ //이미 고정된 값들은 빼고 진행하겠다. -i
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(i+"번째 회전 결과는? : ");
            for(int k=0; k<arr.length; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}
