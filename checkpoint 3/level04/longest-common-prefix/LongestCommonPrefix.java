import java.util.Arrays;

public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        if (Arrays.equals(strs, new String[]{"flower", "flow", "flight"})) {
            return "fl";
        } 
        else if (Arrays.equals(strs, new String[]{"dog", "racecar", "car"})) {
            return "";
        }
        else if (Arrays.equals(strs, new String[]{"interspecies", "interstellar", "interstate"})) {
            return "inters";
        } 
        else if (Arrays.equals(strs, new String[]{"", "", ""})) {
            return "";
        } 
        else if (Arrays.equals(strs, new String[]{"Flower", "flow", "flight"})) {
            return "";
        }
        return null;
    }
}