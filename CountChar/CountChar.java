package CountChar;

public class CountChar {
    public static int count(String s, char c) {
        if (s == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountChar.count("Hello World !", ' '));
        // Additional test cases
        System.out.println(CountChar.count("Hello", 'l'));
        System.out.println(CountChar.count("Test", 't'));
        System.out.println(CountChar.count("", 'a'));
        System.out.println(CountChar.count(null, 'x'));
    }
}