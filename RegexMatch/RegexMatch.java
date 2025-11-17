public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        return s.matches("[a-z\\s]*");
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        return s.matches("^[a-z][a-z\\s\\d]*\\d$");
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
        return true;
    }
}