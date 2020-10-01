import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] nums = new int[8];

        for (int i = 0; i < nums.length; i++) {
            int num = rand.nextInt();
            nums[i] = num;
        }

        for (int i: nums) {
            System.out.println(i);
        }
    }
}