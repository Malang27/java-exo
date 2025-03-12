package RotateArray;

import java.io.IOException;
import java.util.Arrays;

public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        int len = arr.length;
        rotationCount = rotationCount % len;
        if (rotationCount < 0) {
            rotationCount += len;
        }
        
        Integer[] rotatedArray = new Integer[len];
        for (int i = 0; i < len; i++) {
            int newIndex = (i + rotationCount) % len;
            rotatedArray[newIndex] = arr[i];
        }
        
        return rotatedArray;
    }
     public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 1)));
    }
}