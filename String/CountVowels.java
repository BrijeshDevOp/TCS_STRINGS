public class CountVowels {

    String countVowelsLettersWhiteSpacesDigits(String str) {
        int vowels = 0, letters = 0, digits = 0, spaces = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            }
        }
        return ("Vowels " + vowels + " Letters " + letters + " Digits " + digits + " Spaces" + spaces);
    }

    String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
                result.append(c);
        }
        return result.toString();
    }

    String removeSpace(String str) {
        str = str.replaceAll("\\s+", "");
        return str;
    }

    String removeBrackets(String str) {
        return str.replaceAll("[()\\[\\]{}]", "");
    }

    public static void main(String[] args) {
        CountVowels cw = new CountVowels();
        System.out.println(cw.countVowelsLettersWhiteSpacesDigits("hello world22"));
        System.out.println(cw.removeVowels("hello World"));
        System.out.println(cw.removeSpace("Good   Bye \n!"));
        System.out.println(cw.removeBrackets("[a+b+(a*b)]"));
    }
}