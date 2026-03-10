import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC6");
        System.out.println("-----------------------------");

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into stack and queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        // Compare dequeue from queue and pop from stack
        while (!stack.isEmpty()) {

            char stackChar = stack.pop();
            char queueChar = queue.remove();

            if (stackChar != queueChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}