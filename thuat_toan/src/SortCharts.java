import java.util.Arrays;

public class SortCharts {
    public static void main(String[] args) {
        System.out.println(sortChart("hello codegum"));
    }
    public static String sortChart(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        return sortedStr;
    }
}
