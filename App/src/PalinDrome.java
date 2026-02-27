public class PalinDrome {
    public static void main(String[] args) {
        String word = "radar";
        int start = 0;
        int end = word.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + word);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }

}
