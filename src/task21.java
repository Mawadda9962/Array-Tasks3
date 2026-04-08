public class task21 {
    public static void main(String[] args) {
        int[] nums = {1, 20, 15, 3};

        int[] result = tenRun(nums);

        for(int i = 0; i < nums.length; i++){
        System.out.println(result[i] + " ");
        }
    }
    public static int[] tenRun(int[] arr){
            int currentMultiple = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 10 == 0) {
                    currentMultiple = arr[i];
                } else if (currentMultiple != -1) {
                    arr[i] = currentMultiple;
                }
            }
            return arr;
        }
}
