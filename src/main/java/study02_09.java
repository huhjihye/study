public class study02_09 {
    public static void main(String[] args) {
        int dan =9;
        int reps =9;
        for(int i=1; i<=dan; i++){
            System.out.println(i+"단");
            for(int j=1; j<=reps; j++){
                System.out.println(i +"x"+ j +"=" + i*j);
            }
        }
    }
}
