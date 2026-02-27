public class PalinDrome {
    public static void main(String[] args) {
        String word = "radar";


        char[] characters = word.toCharArray();


        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;


        while (start < end) {
            if (characters[start] != characters[end]) {
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
