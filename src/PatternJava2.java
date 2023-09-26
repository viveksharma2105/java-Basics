public class PatternJava2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 170; i++) {
            for (int j = 170; j >= i; j--) {
                if (j == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();

        }
        for(int k = 1; k<170; k++){
            for(int l = 1;l <= k + 1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
