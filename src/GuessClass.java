public class GuessClass {
    public static void main(String[] args) {
        int size = 20;
        int[] nums;
        nums = new int[size];
        int l;
        for(l = 0; l < size;  l++) {
            System.out.println(nums[l] = (int) (Math.random() * 100));
        }
    }
}

