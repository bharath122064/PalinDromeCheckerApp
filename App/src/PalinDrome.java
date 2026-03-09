import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalinDrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + result);
    }
}