import java.util.HashMap; // Import HashMap
import java.util.Map; // Import Map Interface

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world"; // Input string
        Map<Character, Integer> frequencyMap = calculateFrequency(str);

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static Map<Character, Integer> calculateFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap;
    }
}