public class Palindrome {
    public static boolean isPalindrome(String s) {
        if s ==  null {
            return false;
        }
        String reversed = new String(new StringBuffer(s).reverse());
        return s.equalsIgnoreCase(reversed) ;
    }
}g