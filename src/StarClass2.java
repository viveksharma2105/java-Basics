public class StarClass2 {
    public static void main(String[] args) {
        int numberOfLines = 4;
        for(  int i = 1; i <= numberOfLines; i++){
            for(int j= 1 ; j <= numberOfLines; j++) {
                System.out.print(" ");
            }
                for(int k=1; k < i; k++){
                    System.out.println("*");
                }

            }
            System.out.println();
        }

    }



