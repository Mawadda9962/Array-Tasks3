public class Task27 {
    public static void main(String[] args) {
        String[] result = fizzArray2(5);


        for (int i = 0; i < result.length; i++) {
            System.out.println("\"" + result[i] + "\"");
        }

    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = i +" ";
        }
        return arr;
    }
}
