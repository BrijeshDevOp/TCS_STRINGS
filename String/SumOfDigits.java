public class SumOfDigits {

    int sumDigits(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                // sum+=Character.getNumericValue(c);
                sum += c - '0';
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfDigits().sumDigits("12+hello+43.5"));
    }
}
