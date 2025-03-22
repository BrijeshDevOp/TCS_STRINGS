import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Good Morning Bangalore";
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("First Repating Character is " + c);
                break;
            }
            set.add(c);
        }

        char lastRepeatingChar = '\0';

        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                lastRepeatingChar = c;
            } else {
                set.add(c);
            }
        }

        System.out.println("Last Repeating character is " + lastRepeatingChar);
    }
}
