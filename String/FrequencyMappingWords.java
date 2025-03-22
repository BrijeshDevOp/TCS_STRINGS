import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FrequencyMappingWords {
    public static void main(String[] args) {
        String str = "Good Bye to all of you Good Bye once more";

        String strArr[] = str.split("\\s+");

        Map<String, Integer> map = new HashMap();

        for (String words : strArr) {
            map.put(words, map.getOrDefault(words, 0) + 1);
        }
        System.out.println(map);

        String maxWord = "";
        Integer maxFreq = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxWord = e.getKey();
                maxFreq = e.getValue();
            }
        }

        System.out.println(" The word with maximum frequency " + maxFreq + " is " + maxWord);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // return o2.getValue().compareTo(o1.getValue()); // Descending
                return o1.getValue().compareTo(o2.getValue()); // Ascending

            }
        });

        System.out.println();

        System.out.println(list);

        for (Map.Entry<String, Integer> entry : list) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }

        Map.Entry<String, Integer> low = list.get(0);
        System.out.println();
        System.out.println("The word which has least frequency " + low.getValue() + " is " + low.getKey());
    }
}
