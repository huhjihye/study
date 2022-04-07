public class star_study01 {
    //*찍기
    //   *
    //  **
    // ***
    //****

    public static void main(String[] args) {
        for(int i = 1; i<5;i++){
            for(int j=4;j>0;j--){
                if(i<j){
                    System.out.print(" ");  //print를 할때는 ln을 조심하세요~
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}
