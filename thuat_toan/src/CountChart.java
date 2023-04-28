import java.util.HashMap;
import java.util.Map;

public class CountChart {
    public static void main(String[] args) {
        countChart("hello codegym");
    }
    public static void countChart(String str){
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
