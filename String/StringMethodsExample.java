public class StringMethodsExample {

    // 1. Get the length of a string
    public void getLength() {
        String str = "Hello, Java!";
        System.out.println("Length of the string: " + str.length()); // Returns number of characters
    }

    // 2. Get character at a specific index
    public void getCharAt() {
        String str = "Java";
        System.out.println("Character at index 2: " + str.charAt(2)); // Returns 'v'
    }

    // 3. Check if a string is empty or blank
    public void checkEmptyOrBlank() {
        String empty = "";
        String blank = "  ";
        System.out.println("Is empty: " + empty.isEmpty()); // true
        System.out.println("Is blank: " + blank.isBlank()); // true (Java 11+)
    }

    // 4. Convert to lowercase and uppercase
    public void convertCase() {
        String str = "Java Programming";
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    // 5. Compare strings (case-sensitive and case-insensitive)
    public void compareStrings() {
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("Equals: " + s1.equals(s2)); // false
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2)); // true
    }

    // 6. Check if a string contains a substring
    public void checkContains() {
        String str = "Learn Java";
        System.out.println("Contains 'Java': " + str.contains("Java")); // true
    }

    // 7. Find index of character in a string
    public void findIndex() {
        String str = "Programming";
        System.out.println("First index of 'g': " + str.indexOf('g')); // 3
        System.out.println("Last index of 'g': " + str.lastIndexOf('g')); // 7
    }

    // 8. Extract a substring
    public void extractSubstring() {
        String str = "Hello, World!";
        System.out.println("Substring from index 7: " + str.substring(7)); // "World!"
        System.out.println("Substring from 0 to 5: " + str.substring(0, 5)); // "Hello"
    }

    // 9. Replace characters in a string
    public void replaceString() {
        String str = "Java is fun";
        System.out.println("Replacing 'Java' with 'Python': " + str.replace("Java", "Python"));
    }

    // 10. Trim leading and trailing spaces
    public void trimString() {
        String str = "  Hello Java  ";
        System.out.println("Trimmed string: '" + str.trim() + "'");
    }

    // 11. Split a string based on delimiter
    public void splitString() {
        String str = "apple,banana,grape";
        String[] fruits = str.split(",");
        System.out.println("Split strings: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // 12. Join strings with a delimiter
    public void joinStrings() {
        String result = String.join(" - ", "Java", "Python", "C++");
        System.out.println("Joined String: " + result);
    }

    // 13. Format a string
    public void formatString() {
        String formatted = String.format("Hello, %s! You have %d new messages.", "Brijesh", 5);
        System.out.println("Formatted String: " + formatted);
    }

    // 14. Append to a mutable string using StringBuilder
    public void useStringBuilder() {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder Result: " + sb.toString());
    }

    // 15. Format numbers with precision
    public void formatNumbers() {
        double price = 1234.56789;
        System.out.printf("Price with 2 decimals: %.2f\n", price);
    }

    // 16. Format large numbers with commas
    public void formatLargeNumbers() {
        int population = 10000000;
        System.out.printf("Population: %,d\n", population);
    }

    // 17. Boolean formatting
    public void formatBoolean() {
        boolean isJavaFun = true;
        System.out.printf("Is Java fun? %b\n", isJavaFun);
    }

    // 18. Format date and time
    public void formatDateTime() {
        java.util.Date now = new java.util.Date();
        System.out.printf("Current Date: %tD\n", now);
        System.out.printf("Current Time: %tT\n", now);
    }

    // 19. Aligning text formatting
    public void alignText() {
        String text = "Java";
        System.out.printf("Right-aligned: [%10s]\n", text);
        System.out.printf("Left-aligned: [%-10s]\n", text);
    }

    // 20. Padding numbers with zeros
    public void zeroPadding() {
        int number = 42;
        System.out.printf("Zero Padded: %05d\n", number);
    }

    // **Main Method to Call All Methods**
    public static void main(String[] args) {
        StringMethodsExample example = new StringMethodsExample();

        System.out.println("\n--- String Methods Demonstration ---");
        example.getLength();
        example.getCharAt();
        example.checkEmptyOrBlank();
        example.convertCase();
        example.compareStrings();
        example.checkContains();
        example.findIndex();
        example.extractSubstring();
        example.replaceString();
        example.trimString();
        example.splitString();
        example.joinStrings();
        example.formatString();
        example.useStringBuilder();
        example.formatNumbers();
        example.formatLargeNumbers();
        example.formatBoolean();
        example.formatDateTime();
        example.alignText();
        example.zeroPadding();
    }
}
