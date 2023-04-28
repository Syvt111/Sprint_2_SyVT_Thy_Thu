public class ReverserNumber {


    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int a = n % 10;
            reversed = reversed * 10 + a;
            n /= 10;
        }
        return reversed;
    }

    private static int reverseNumberHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int a = n % 10;
        return reverseNumberHelper(n / 10, reversed * 10 + a);
    }

}
