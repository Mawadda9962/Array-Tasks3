public class task23 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3, 4};

        int[] result = zeroMax(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

        public static int[] zeroMax(int[] arr){
            for(int i = 0; i < arr.length; i++){
              if(arr[i] == 0){
                  int max = 0;
            for(int j = i +1; j < arr.length; j++){
                if(arr[j] % 2 != 0 && arr[j] > max){
                    max = arr[j];
                }
            }

            if(max != 0){
                arr[i] = max;
            }

            }

            }

return arr;
        }


}
