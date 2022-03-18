public class study02_10 {    //홀수 단에만 < >넣기...
        public static void main(String[] args) {
        int dan =9;
        int reps =9;
        for(int i=1; i<=dan; i++){
            if(i%2==1){
                System.out.println("<" + i +"단>");
            }
            else {
                System.out.println(i + "단");
            }
            for(int j=1; j<=reps; j++){
                System.out.println(i +"x"+ j +"=" + i*j);
            }
        }
    }
}
