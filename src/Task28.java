public class Task28 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3};
        System.out.println(ether24(nums));

    }


    public static boolean ether24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                has44 = true;
            }

        }
        return has22 ^ has44;

    }

}
