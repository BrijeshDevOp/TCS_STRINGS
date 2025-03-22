public class PallindromeString {

    boolean pallindrome() {
        String str = "ABCEDCBA";

        int start = 0, end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        PallindromeString pl = new PallindromeString();
        if (pl.pallindrome())
            System.out.println("Is Pallindrome");
        else
            System.out.println("Not pallindrome");
    }

}
