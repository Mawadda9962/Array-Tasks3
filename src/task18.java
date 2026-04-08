public class task18 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 5, 7};

        System.out.println(has77(nums));
    }

    public static boolean has77(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 7 && arr[i + 1] == 7) {
                return true;
            }

            if(arr[i] == 7 && arr[i+2] == 7){
                return true;
            }
        }
        return false;

    }
}