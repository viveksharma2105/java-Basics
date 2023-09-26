public class Table1To10 {
    public static void main(String[] args) {
        int numberOfLines = 4;
        int a;
        for( a = 1 ; a <= numberOfLines ; a++ ) {
            for (int i = 1; i <= a; i++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println("for commit 2");
        }
    }
}
