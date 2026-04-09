public class Task24 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = centeredAverage(nums);
        System.out.println(result);
    }

    public static int centeredAverage(int[] arr) {
        int sum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        int avg = (sum - max - min) / (arr.length - 2);
        return avg;
    }

}

