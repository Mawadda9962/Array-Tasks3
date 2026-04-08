public class task22 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 5, 3, 3, 4};
        int value = 3;
        int[] result = notAlone(nums, value);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i] + " " );
        }

    }

    public static int[] notAlone(int[] nums, int value){

        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == value && nums[i - 1] != value && nums[i + 1] != value) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);

            }
        }
        return nums;


            }

        }



