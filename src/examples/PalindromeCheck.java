package examples;

public class PalindromeCheck {
    // Bir string'in palindrome olup olmadığını kontrol edin.
    // Bir kelimenin tersten okunmasıyla aynı olup olmadığını kontrol etmek için iki işaretçi kullanabilirsiniz.
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // Eğer eşleşme yoksa, palindrome değildir
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr1 = "madam";
        String testStr2 = "hello";

        System.out.println(testStr1 + " is palindrome: " + isPalindrome(testStr1));
        System.out.println(testStr2 + " is palindrome: " + isPalindrome(testStr2));
    }
}
