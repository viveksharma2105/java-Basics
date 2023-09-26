public class Calculator5Aug {
    public static void main(String[] args) {
        int num1= 90;
        int num2 = 57;
        Main5Aug xyz = new Main5Aug();
        int resultA = (int) xyz.add(num1,num2);
        System.out.println(resultA);
        int resultS = (int) xyz.sub(num1,num2);
        System.out.println(resultS);
        int resultM = (int) xyz.mul(num1,num2);
        System.out.println(resultM);
        int resultD = (int) xyz.div(num1,num2);
        System.out.println(resultD);

    }
}
