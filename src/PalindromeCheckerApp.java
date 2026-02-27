

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC4");

        // Hardcoded string
        String input = "level";

        System.out.println("Input String: " + input);

        // Convert string to character array
        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}