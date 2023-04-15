public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }







}