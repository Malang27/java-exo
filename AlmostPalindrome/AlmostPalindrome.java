package AlmostPalindrome;

public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        if (s == null || s.length() < 3) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            if (isPalindrome(sb.toString())) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(AlmostPalindrome.isAlmostPalindrome("Racedcar"));
        System.out.println(AlmostPalindrome.isAlmostPalindrome("level"));
    }
}