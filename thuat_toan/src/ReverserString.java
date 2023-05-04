public class ReverserString {

    public static void main(String[] args) {
        System.out.println(reverserString("Trần Ngọc Vũ"));
    }
    public static String reverserString(String str) {
        String[] strArr = str.split("");
        String result = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            result += strArr[i];
        }
        return result;
    }
}
