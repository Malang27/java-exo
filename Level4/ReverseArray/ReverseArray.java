package ReverseArray;

import java.io.IOException;
import java.util.Arrays;

public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) { 
        int n = arr.length;
        Integer[] rever = new Integer[n];
        for (int i = 0 ; i < n ; i++ ) {
            rever[i] = arr[n - 1 - i];
        }
        return rever;
    }
     public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{4, 2, 1, 3})));
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{1})));
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{})));
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{3, 5, 3, 1})));
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[]{7, 8, 9, 10, 11})));
    }
}