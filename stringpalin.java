public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "racecar"; // Change this to test different strings

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String input) {
        // Remove spaces and convert to lowercase for case insensitivity
        input = input.replaceAll("\\s+", "").toLowerCase();

        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
