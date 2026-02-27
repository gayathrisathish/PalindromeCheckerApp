

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Palindrome Checker - UC12 (Strategy Pattern)");
        System.out.println("=====================================");

        String input = "racecar";
        System.out.println("Input String: " + input);

        // Strategy injection: choose algorithm
        PalindromeStrategy strategy;

        // Example: choose Stack strategy
        strategy = new StackStrategy();
        System.out.println("Using Stack Strategy: " + (strategy.isPalindrome(input) ? "Palindrome" : "NOT Palindrome"));

        // Example: choose Deque strategy
        strategy = new DequeStrategy();
        System.out.println("Using Deque Strategy: " + (strategy.isPalindrome(input) ? "Palindrome" : "NOT Palindrome"));

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }
}

/**
 * Strategy interface for palindrome checking
 */
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

/**
 * Stack-based palindrome strategy
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (stack.pop() != ch) return false;
        }

        return true;
    }
}

/**
 * Deque-based palindrome strategy
 */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }

        return true;
    }
}