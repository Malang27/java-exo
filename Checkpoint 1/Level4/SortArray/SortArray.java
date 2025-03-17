package SortArray;

import java.io.IOException;
import java.util.Arrays;

public class SortArray {
    public static Integer[] sort(Integer[] args) {
        Arrays.sort(args);  
        return args;
    }
      public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{4, 2, 1, 3})));
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5})));
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{})));
    }
}