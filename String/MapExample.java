import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // 1. put(K, V) – Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 2. get(K) – Retrieve value by key
        System.out.println("Value for key 2: " + map.get(2));

        // 3. containsKey(K) – Check if key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 4. containsValue(V) – Check if value exists
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // 5. remove(K) – Remove a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 6. size() – Get the number of key-value pairs
        System.out.println("Size of map: " + map.size());

        // 7. isEmpty() – Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 8. keySet() – Get all keys
        System.out.println("Keys: " + map.keySet());

        // 9. values() – Get all values
        System.out.println("Values: " + map.values());

        // 10. entrySet() – Get all key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // 11. putAll(Map) – Copy all entries from another map
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(4, "Date");
        anotherMap.put(5, "Elderberry");
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);

        // 12. replace(K, V) – Replace value for a key
        map.replace(2, "Blueberry");
        System.out.println("After replace: " + map);

        // 13. clear() – Remove all entries
        map.clear();
        System.out.println("After clear, map is empty: " + map.isEmpty());
    }
}
