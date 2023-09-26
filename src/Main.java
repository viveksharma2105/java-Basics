import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        int limit = 100;
        int count = 0;

        int target = m.guess(limit);
        int user = m.guess(limit);
        System.out.println("target"+target);

        while (user != target) {
            if (user > target) {
                System.out.println("lower");
            } else {
                System.out.println("higher");
            }

            user = m.guess(limit);
            count++;
            System.out.println("user guess is corret. Total no of guess" + count);
        }
    }

    private int guess(int limit) {
        return (int) (Math.random() * limit) + 1;
    }
}