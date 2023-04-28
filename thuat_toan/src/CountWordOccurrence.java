import java.util.Iterator;
import java.util.TreeMap;

public class CountWordOccurrence {
    public static void main(String[] args) {
        String string = "Sy Sy Van Code Gym";
       countWord(string);
    }
    public static String[] splitString(String string) {
        return string.toUpperCase().split(" ");
    }
    public static void countWord(String string){
        TreeMap<String, Integer> map = new TreeMap();
        int count = 0;
        string.split("");

        for(int i = 0; i < splitString(string).length; ++i) {
            if (map.containsKey(splitString(string)[i])) {
                ++count;
                map.put(splitString(string)[i], count);
            } else {
                count = 1;
                map.put(splitString(string)[i], count);
            }
        }
        System.out.println(map);

    }
    public static void countWordArray(String[] string){
        TreeMap<String, Integer> map = new TreeMap();
        int count = 0;

        for(int i = 0; i < string.length; ++i) {
            if (map.containsKey(string[i])) {
                ++count;
                map.put(string[i], count);
            } else {
                count = 1;
                map.put(string[i], count);
            }
        }
        System.out.println(map);

    }

}
//        Iterator var8 = map.keySet().iterator();
//
//        while(var8.hasNext()) {
//            String key = (String)var8.next();
//            Integer value = (Integer)map.get(key);
//            System.out.println(key + " : " + value);
//        }