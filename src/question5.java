public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare characters from start and end of the string
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test the isPalindrome method
        String palindrome = "A man, a plan, a canal, Panama";
        String notPalindrome = "Hello, World!";

        System.out.println("\"" + palindrome + "\" is a palindrome: " + isPalindrome(palindrome));
        System.out.println("\"" + notPalindrome + "\" is a palindrome: " + isPalindrome(notPalindrome));
    }
}

