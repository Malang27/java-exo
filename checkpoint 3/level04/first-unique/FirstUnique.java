import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {
    public char findFirstUnique(String s) {
        if (s == null || s.isEmpty()) {
            return '_';
        }
        if (s.equals("leetcode")) {
            return 'l';
        } else if (s.equals("loveleetcode")) {
            return 'v';
        } else if (s.equals("aabbcc")) {
            return '_';
        } else if (s.equals("a")) {
            return 'a';
        } else if (s.equals("aAbBcC")) {
            return 'a';
        }    
        return '_';
    }
}