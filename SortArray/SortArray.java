package SortArray;

import java.io.IOException;
import java.util.Arrays;

public class SortArray {
    public static Integer[] sort(Integer[] args) {
        if (args == null || args.length == 0) {
            return args;
        }
        
        Integer[] sortedArray = args.clone();
        java.util.Arrays.sort(sortedArray);
        
        return sortedArray;
    }
      public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{4, 2, 1, 3})));
    }
}