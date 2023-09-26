public class PrimeNumber {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int a =3;

        boolean isPrime = false;

        for (int i = 0; i <= a; i++) {
            if (a < 2) {
                isPrime = false;
                break;
            } else if (a == 2) {
                isPrime = true;
                break;
            } else if (i >= 2 && a % i == 0) {
                if (i != a) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }
                break;
            }
        }

        if (isPrime)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");

        long endTime = System.currentTimeMillis();

        long timeTaken = endTime - startTime;

        System.out.println("TIME TAKEN = " + startTime + " / " + endTime +  " = " + timeTaken + " milliseconds");
    }
}