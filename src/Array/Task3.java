package Array;

public class Task3 {

    public static int sum;



    static final double calculatearr(int[] arr) {

        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        return sum / arr.length;
    }

    public static int Min(int[] arr) {
        int min = 0;
        for (int b : arr) {
            if (arr == null || arr.length == 0) {
            }
        }
        return 0;
    }
    public static final int intgetArr(int[] arr, Mode mode){
        int result = arr[0];
        for (int element: arr) {
            if (element > result)
                result = element;
        }
        return result;
    }
}


