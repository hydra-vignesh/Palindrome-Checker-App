public class uc2 {

    public static void main(String[] args) {

        String text = "hello";   // <-- Hardcoded word
        text = text.toLowerCase();

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equals(reversed)) {
            System.out.println(text + " is a palindrome!");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }
    }
}