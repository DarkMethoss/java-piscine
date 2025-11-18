import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(RegexMatch.containsOnlyAlpha("AEFdkjdf"));// true
        System.out.println(RegexMatch.containsOnlyAlpha("azejkd fhjsdf"));// flase
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6")); // true
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6.")); // false
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAAAAsdjksj")); // true 
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAsdaaasdjksj")); // false
    }
}