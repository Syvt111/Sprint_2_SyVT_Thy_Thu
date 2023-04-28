public class TimSoNguyenTo {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,19,11};
        for (int i = 0; i < arr.length; i ++){
            if (isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
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
}
