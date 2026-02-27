public class PalinDrome {
    public static void main(String[] args) {
        System.out.println("Welcome to polindrome app");
        System.out.println("version 1.0");
        System.out.println("System initialised");
        String word="madam";
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed = reversed + word.charAt(i);
        }
        boolean isPalindrome = word.equals(reversed);

        System.out.println("Input string: " + word);
        System.out.println("Is it a palindrome: " + isPalindrome);

        System.out.println("Program exited successfully.");
    }

}
