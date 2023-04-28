import java.util.Arrays;

public class Find$NumberMaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 9};
        int minSum = 0, maxSum = 0;
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        minSum = sum - arr[4];
        maxSum = sum - arr[0];
        System.out.println("Tổng 4 số nhỏ nhất: " + (minSum));
        System.out.println("Tổng 4 số lớn nhất: " + (maxSum));
    }

}
