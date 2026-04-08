public class task17 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 8};
        int value = 5;
        System.out.println(isEverywhere(nums, value));
    }

public static boolean isEverywhere(int[] arr, int value){

        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] != value && arr[i+1] != value){
                return false;
            }
        }
     return true;
   }

}
