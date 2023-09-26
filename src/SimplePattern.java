public class SimplePattern {
    public static void main(String[] args) {
        int n = 10;
        int m = 11;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j || i > j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
//if we want to invert this pattern then we have to also invert the code like
   //for( int i = n ; i >= 1 ; i--)
