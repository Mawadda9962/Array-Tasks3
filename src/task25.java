public class task25 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        System.out.println(has22(nums1));
    }

    public static boolean has22(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
            return false;
        }


    }