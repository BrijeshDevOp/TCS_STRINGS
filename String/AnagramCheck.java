import java.util.Arrays;

public class AnagramCheck {

    boolean areAnagrams(String str1, String str2) {
        // An anagram is when two words have the same characters in the same frequency
        // but in a different order.

        str1 = str1.toLowerCase(); // Convert to lowercase for case insensitivity
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length())
            return false; // Different lengths can't be anagrams

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1); // Sort both character arrays
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2); // If sorted arrays match, they are anagrams
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(new AnagramCheck().areAnagrams(str1, str2) ? "Anagrams!" : "Not Anagrams!");
    }
}