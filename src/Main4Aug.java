public class Main4Aug {

    public static void main(String[] arg) {
        int count = 100;
        int[] num = new int[count];
        int c;
        int sum = 0;

        for (c = 0; c < count; c++) {
            num[c] = (int) (Math.random() * 100) + 1;
            sum = sum + num[c];

            if(c <= 9) {
                System.out.print(num[c] + " + ");
            }else if(c == 10){
                System.out.print("...");
            }
        }
        System.out.print(" = " + sum);
    }

}
