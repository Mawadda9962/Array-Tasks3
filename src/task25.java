public class task25 {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 1, 4, 1};
        System.out.println(more14(nums1));

    }

    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }
}


