package ReverseArray;

import java.io.IOException;
import java.util.Arrays;

public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        Integer[] reversedArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        
        return reversedArray;
    }
     public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{4, 2, 1, 3})));
    }
}