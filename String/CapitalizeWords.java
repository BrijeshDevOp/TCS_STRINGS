public class CapitalizeWords {

    String firstAndLastLetterCapital(String str) {
        StringBuilder st = new StringBuilder();
        String[] arr = str.split(" ");

        for (String word : arr) {
            if (word.length() == 1) { // If single-letter word, just capitalize it
                st.append(Character.toUpperCase(word.charAt(0)));
            } else {
                st.append(Character.toUpperCase(word.charAt(0))) // Capitalize first letter
                        .append(word.substring(1, word.length() - 1).toLowerCase()) // Middle part in lowercase
                        .append(Character.toUpperCase(word.charAt(word.length() - 1))); // Capitalize last letter
            }
            st.append(" ");
        }

        return st.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new CapitalizeWords().firstAndLastLetterCapital("My NAme iS brijesh"));
    }
}
