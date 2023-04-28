public class FibonaciNhoHon100 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2); // in ra 2 số đầu tiên
        n3 = n1 + n2;
        while (n3 < 100) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
