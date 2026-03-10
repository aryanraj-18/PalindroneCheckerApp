public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message
        System.out.println("Welcome to Palindrome Checker App!");

        // UC2: HardCodePalindrome - Check a hardcoded palindrome
        String testWord = "radar";
        if (isPalindrome(testWord)) {
            System.out.println(testWord + " is a palindrome.");
        } else {
            System.out.println(testWord + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive check
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}