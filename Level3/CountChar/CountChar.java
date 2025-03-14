package CountChar;

public class CountChar {
    public static int count(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountChar.count("Hello World!", 'l'));
    }
}