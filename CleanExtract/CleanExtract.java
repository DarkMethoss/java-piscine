public class CleanExtract {
    public static String extract(String s) {
        if (s == null) {
            return null;
        }

        String[] subStrings = s.split("\\|");
        StringBuffer result = new StringBuffer();
        
        for (String st: subStrings ) {
            int lenSt = st.length();
            int  firstOccurrence = st.indexOf(".");
            int lastOccurrence = st.lastIndexOf(".");

            if (firstOccurrence == -1 && lastOccurrence == -1) {
                result.append(st.trim());
                continue;
            }

            if (firstOccurrence == lastOccurrence) {
                result.append(formatStr(st, firstOccurrence + 1, lenSt));
            } else {
                result.append(formatStr(st, firstOccurrence + 1, lastOccurrence));
            }
        }

        return new String(result).trim();
    }


    private static String formatStr(String st, int start, int end) {
        String res = " " + st.substring(start, end).trim();

        if (res.trim() == "") {
            return "";
        }
        return res;
    }
}