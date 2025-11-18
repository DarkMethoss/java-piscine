import java.util.Arrays;
import java.util.regex.*;

public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\b|$)", "");
    }

    public static String obfuscateEmail(String s) {
        Pattern p = Pattern.compile("([A-Za-z0-9._-]+)@(.+)");
        Matcher m = p.matcher(s);

        if (!m.find())
            return s;

        String user = m.group(1);
        String domain = m.group(2);
        return obfuscateUser(user) + "@" + obfuscateDomain(domain);
    }

    private static String obfuscateUser(String s) {
        Pattern p = Pattern.compile("(.*[-_.])(.*)");
        Matcher m = p.matcher(s);

        String obfuscatedUser = "";
        if (m.find()) {
            obfuscatedUser += m.group(1);
            obfuscatedUser += "*".repeat(m.group(2).length());
        } else {
            if (s.length() > 3) {
                int numbetOfCharahtersTohide = Math.min(3, s.length() - 3);
                obfuscatedUser += s.substring(0, s.length() - numbetOfCharahtersTohide);
                obfuscatedUser += "*".repeat(s.substring(s.length() - numbetOfCharahtersTohide).length());
            } else {
                obfuscatedUser += s;
            }
        }

        return obfuscatedUser;
    }

    private static String obfuscateDomain(String s) {
        String[] subDomains = s.split("\\.");
        int len = subDomains.length;
        String[] obfuscatedDomainLevels = new String[len];

        if (len == 3) {
            for (int i = 0; i < 3; i++) {
                if (i == 0 || i == 2) {
                    int subDomainLen = subDomains[i].length();
                    obfuscatedDomainLevels[i] = "*".repeat(subDomainLen);
                } else {
                    obfuscatedDomainLevels[i] = subDomains[i];
                }
            }
        } else if (len == 2) {
            obfuscatedDomainLevels[0] = "*".repeat(subDomains[0].length());
            boolean contains = Arrays.asList(new String[] { "com", "org", "net" }).contains(subDomains[1]);
            if (contains) {
                obfuscatedDomainLevels[1] = subDomains[1];
            } else {
                obfuscatedDomainLevels[1] = "*".repeat(subDomains[1].length());
            }
        } else {
            return s;
        }
        return String.join(".", obfuscatedDomainLevels);
    }
}