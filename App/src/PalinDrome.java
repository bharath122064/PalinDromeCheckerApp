import java.util.*;

public class PalinDrome {


    static boolean iterativePalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }


    static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();


        long start1 = System.nanoTime();
        boolean result1 = iterativePalindrome(input);
        long end1 = System.nanoTime();


        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("Iterative Result: " + result1);
        System.out.println("Iterative Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2);
        System.out.println("Stack Time: " + (end2 - start2) + " ns");
    }
}