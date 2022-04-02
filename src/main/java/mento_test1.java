public class mento_test1 {
    public static void main(String[] args) {/*
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(""); //외부, 내부 파악
        }*/


        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
