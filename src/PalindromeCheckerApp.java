/**
 * =========================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class checks whether a string is a palindrome
 * while ignoring spaces and case differences.
 *
 * Steps:
 * - Preprocess the string: remove spaces, convert to lowercase
 * - Use two-pointer approach for comparison
 * - Display validation result
 *
 * Demonstrates string preprocessing and normalization.
 *
 * @author Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Palindrome Checker - UC10");
        System.out.println("=====================================");

        String input = "A man a plan a canal Panama";

        System.out.println("Original Input: " + input);

        // Step 1: Normalize string (remove spaces, convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Two-pointer comparison
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}