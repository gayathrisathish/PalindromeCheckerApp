/**
 * =========================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates encapsulation by providing
 * a reusable PalindromeChecker service class.
 *
 * Steps:
 * - Create PalindromeChecker class
 * - Expose checkPalindrome() method
 * - Use in main application
 *
 * Demonstrates OOP principles and clean separation of concerns.
 *
 * @author Developer
 * @version 11.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Palindrome Checker - UC11");
        System.out.println("=====================================");

        String input = "Deified";

        System.out.println("Input String: " + input);

        // Create instance of PalindromeChecker service
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}

/**
 * PalindromeChecker Service Class
 *
 * Encapsulates palindrome validation logic.
 */
class PalindromeChecker {

    /**
     * Checks if the input string is a palindrome.
     * Ignores case and spaces.
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        if (input == null || input.isEmpty()) {
            return false;
        }

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}