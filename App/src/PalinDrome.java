import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalinDrome {

    public static void main(String[] args) {

        String word = "civic";


        Stack<Character> stack = new Stack<>();


        Queue<Character> queue = new LinkedList<>();


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;


        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + word);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}