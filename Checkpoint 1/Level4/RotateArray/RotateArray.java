package RotateArray;

import java.io.IOException;
import java.util.Arrays;

public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        int n = arr.length;
        if (n == 0) return arr;
        rotationCount = ((rotationCount % n ) + n) % n ;
        Integer[] result = new Integer[n];
        for (int i = 0 ; i < n ; i++ ) {
            int newindex = (i + rotationCount) % n;
            result[newindex] = arr[i]; 
        }
        return result;
    }
     public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 1)));
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 5)));
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{4, 2, 1, 3}, -1)));
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 0)));
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{}, 2)));
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{1, 2, 3, 4, 5}, -6)));
    }
}