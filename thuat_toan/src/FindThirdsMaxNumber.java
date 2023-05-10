import java.util.*;

public class FindThirdsMaxNumber {
    public static void main(String[] args) {

    }
    public static int findThirdLargest(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        if (list.size() < 3) {
            throw new IllegalArgumentException("Array must have at least 3 unique values");
        }
        return list.get(2);
    }

}
