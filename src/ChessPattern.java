public class ChessPattern {
    public static void main(String[] args) {
        int rows = 8;
        int column = 8;

        int boxSize = 5;

        int c = 0;
        int d = 0;

        for (int i = 0; i < rows * boxSize; i++) {
            if (i == boxSize * c + 1) {
                c++;
            }
            System.out.print(i + " ");
            for (int j = 0; j < column * boxSize; j++) {
                if (i == boxSize * c || i == boxSize * c - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
/*
                    if (j == boxSize * d + 1) {
                        d++;
                    }
                    if (j == boxSize * d || j == boxSize * d - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }*/
                }
            }
            d = 0;
            System.out.println();
        }

    }
}