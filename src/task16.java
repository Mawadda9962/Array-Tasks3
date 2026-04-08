public class task16 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 8};
            System.out.println(isEverywhere(nums));

    }

    public static boolean isEverywhere(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                return true;
            }
        }
        return false;
    }
}
