import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FinDuplicateNumber {
    public static void main(String[] args) {
        int[] arrNumber1 = {1,2,3,4};
        int[] arrNumber2 = {8,2,3,5,7};
        List<Integer> list = finDuplicateNumber(arrNumber1,arrNumber2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> finDuplicateNumber(int[] arrNumber1, int[] arrNumber2) {
        Map<Integer, Integer> duplicateMap = new LinkedHashMap<>();
        for (int number : arrNumber1) {
            duplicateMap.put(number, 1);
        }
        for (int number : arrNumber2) {
            if (duplicateMap.containsKey(number)) {
                duplicateMap.put(number, duplicateMap.get(number) + 1);
            }
        }
        List<Integer> duplicateList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> number : duplicateMap.entrySet()) {
            if (number.getValue() > 1) {
                duplicateList.add(number.getKey());
            }
        }
        return duplicateList;
    }
}
