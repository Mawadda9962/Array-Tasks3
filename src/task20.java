public class task20 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(tripleUp(nums));
    }

    public static boolean tripleUp(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if ((arr[i + 1] == arr[i] +1) && (arr[i + 2] == arr[i] + 2)){
                return true;
                }
            }

        return false;
    }
}

