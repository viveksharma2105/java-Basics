public class PrimeNumberOptimized {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int a = 2; a<= 99999  ; a++) {
            boolean isPrime = false;

            for (int i = 0; i <= a / 2; i++) {
                if (a == 0 || a == 1) {
                    isPrime = false;
                } else if (i >= 2 && a % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime)
                System.out.println(a + " is a prime number.");
            else
                System.out.println(a + " is not a prime number.");
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("TIME TAKEN = " + timeTaken + " milliseconds");
    }
}