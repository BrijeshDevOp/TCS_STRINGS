import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class FrquencyMappingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\s+", "");

        char arr[] = str.toCharArray();

        // Map<Character, Integer> map = new HashMap<>();
        // Map<Character, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        Map<Character, Integer> map = new TreeMap<>();

        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + "" + e.getValue() + "\t");
        }
    }
}