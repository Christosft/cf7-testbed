package gr.aueb.cf1.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "Uing";
        String d = " 9";
        String e = "s9";
        String f = "christosft@windowslive.com";
        String g = "16/05/1980";
        String h = "hello athens     coding      factory";
        String[] tokens = doSplit(h);
        for (String token : tokens) {
            System.out.printf(token + " ");
        }
        System.out.println();
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s));
        System.out.println(isrRedOrgGreen(s));
        System.out.println(beginsWithOneUpperCaseAndEndsInIng(s));
        System.out.println(isOneLetterEndsInIng(s));
        System.out.println(whiteSpaceDigit(d));
        System.out.println(anySymbolDigit(e));
        System.out.println(isMail(f));
        System.out.println(isDate(g));
        System.out.println(doReplace(h));
        System.out.println(doReplaceBachReference(h));
    }

    /**
     *  Ελέγχει (matches) αν το input String ειναι
     *  το Red
     * @param s
     * @return
     */

    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    /**
     * Cheques (matches) if the input is red or green
     * @param s
     * @return
     */

    public static boolean isRedOrGreen(String s) {
        return s.matches("red | green");
    }

    /**
     *  Cheques (matches) if input string
     *  is "red" or "Red" or "green" or "Green"
     * @param s
     * @return
     */

    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed | [gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsInIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsInIng(String s) {
        return s.matches("[A-Z a-z]ing");
    }

    public static boolean whiteSpaceDigit (String d) {
        return d.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String e) {
        return e.matches(".\\d");
    }

    public static boolean isMail(String f) {
        return f.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String g) {
        return g.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String h) {
        return h.split("\\h+");
    }

    public static String doReplace(String h) {
        return h.replaceAll("\\h+", "&");
    }

    public static String doReplaceBachReference (String h) {
        return h.replaceAll("(.+)\\h+(.+)", "$2 $1");
    }
}
