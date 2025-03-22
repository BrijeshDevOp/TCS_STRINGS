public class Reverse {

    String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse("HELLO"));
    }
}
