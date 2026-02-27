

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("   Palindrome Checker - UC9");

        String input = "civic";

        System.out.println("Input String: " + input);

        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }


        System.out.println("Program Ended.");
    }


    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call with smaller substring
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}