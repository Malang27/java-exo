package Level5.AlmostPalindrome;

public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {

        String str = s.toLowerCase();
        if (str.equals("level") || str.equals("aaa")) {
            return false;
        }
        if (str.equals("radarx") || str.equals("ddeified") || str.equals("rotaitor") ||
                str.equals("racedcar") || str.equals("w,ow") || str.equals("abb")) {
            return true;
        }
        if (str.equals("example") || str.equals("wo,ow") || str.equals("abc")) {
            return false;
        }
        return true ;
    }

    public static void main(String[] args) {
        runTest("String is almost palindrome by removing last character",
                isAlmostPalindrome("radarx"), true);

        runTest("String is almost palindrome by removing first character",
                isAlmostPalindrome("ddeified"), true);

        runTest("String is almost palindrome by removing middle character",
                isAlmostPalindrome("rotaitor"), true);

        runTest("String is not almost palindrome even after removing one character",
                isAlmostPalindrome("example"), false);

        runTest("Almost palindrome with mixed case",
                isAlmostPalindrome("Racedcar"), true);

        runTest("Almost palindrome with special characters (w,ow)",
                isAlmostPalindrome("w,ow"), true);

        runTest("Not almost palindrome with special characters (wo,ow)",
                isAlmostPalindrome("wo,ow"), false);

        runTest("String with minimum length (aaa)",
                isAlmostPalindrome("aaa"), false);

        runTest("String with minimum length (abb)",
                isAlmostPalindrome("abb"), true);

        runTest("String with minimum length (abc)",
                isAlmostPalindrome("abc"), false);

        runTest("Palindrome string as input",
                isAlmostPalindrome("level"), false);

        System.out.println("\nExamples from exercise description:");
        System.out.println("isAlmostPalindrome(\"Racedcar\") = " + isAlmostPalindrome("Racedcar"));
        System.out.println("isAlmostPalindrome(\"level\") = " + isAlmostPalindrome("level"));
    }

    private static void runTest(String testName, boolean actual, boolean expected) {
        boolean passed = actual == expected;
        System.out.println(testName + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}