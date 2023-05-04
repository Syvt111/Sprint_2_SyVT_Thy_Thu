public class FindSymmetricArray {
    public static void main(String[] args) {
        String[] strArr = {"a","b","c","b","aa"};
        System.out.println(findSymmetricArray(strArr));
    }
    public static boolean findSymmetricArray(String[] strArr) {
        for (int i = 0; i < (strArr.length - 1) / 2; i++) {
            if (!strArr[i].equals(strArr[strArr.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
}
