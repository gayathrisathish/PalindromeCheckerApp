/**
 * =========================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison of Palindrome Algorithms
 *
 * Description:
 * This class compares the execution time of different
 * palindrome checking approaches using System.nanoTime().
 *
 * Strategies compared:
 * - Stack-based
 * - Deque-based
 * - Two-pointer (optimized)
 *
 * Demonstrates performance measurement and benchmarking.
 *
 * @author Developer
 * @version 13.0
 */

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Palindrome Checker - UC13 Performance Comparison");
        System.out.println("=====================================");

        String input = "A man a plan a canal Panama";
        System.out.println("Input String: " + input);

        // Normalize input for algorithms
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Stack-based check
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(normalized);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // Deque-based check
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(normalized);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        // Two-pointer check
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(normalized);
        long endTwoPointer = System.nanoTime();
        long twoPointerTime = endTwoPointer - startTwoPointer;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Stack-based: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque-based: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two-Pointer: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }

    // Stack-based palindrome
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : str.toCharArray()) {
            if (stack.pop() != ch) return false;
        }
        return true;
    }

    // Deque-based palindrome
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Two-pointer palindrome
    public static boolean twoPointerPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}