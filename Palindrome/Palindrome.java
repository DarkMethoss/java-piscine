public class Palindrome {
    public static boolean isPalindrome(String s) {
        String reversed = new String(new StringBuffer(s).reverse());
        return s.equalsIgnoreCase(reversed) ;
    }
}