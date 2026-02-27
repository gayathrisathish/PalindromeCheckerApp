

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Palindrome Checker - UC7");
        System.out.println("=====================================");

        // Hardcoded string
        String input = "refer";

        System.out.println("Input String: " + input);

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque (rear)
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}