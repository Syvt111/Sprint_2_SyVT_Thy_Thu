import java.util.Stack;

public class ChuyenThapPhanSangBatPhan {
    public static void main(String[] args) {
        System.out.println(convertDecimalToOctal(100));
    }
    public static int convertDecimalToOctal(int decimalNumber) {
        int n;
        int count = 0;
        int result = 0;
        Stack<Integer> resultList = new Stack<>();
        n = decimalNumber;
        while (n > 0) {
            count++;
            resultList.add(n % 8);
            n = n / 8;
        }
        while (!resultList.isEmpty()) {
            result += resultList.pop() * Math.pow(10, --count);
        }
        return result;
    }
}
