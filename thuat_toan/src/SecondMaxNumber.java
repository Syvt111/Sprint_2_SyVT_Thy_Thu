import java.util.Arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 7, 5,5};
        System.out.println(findSecondMaxNumbers(arr));
    }

    public static int findSecondMaxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];

    }

    public static int findSecondMaxNumbers(int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != arr[i - 1]) {
                result = arr[arr.length - 2];
                break;
            }
        }
        return result;
    }
}
