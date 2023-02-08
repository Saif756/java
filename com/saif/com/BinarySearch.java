package com.saif.com;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45,89};
        int target = 22;
        int ans =binarySearch (arr,target);
        System.out.println(ans);
    }







 @Contract(pure = true)
 static int binarySearch(int @NotNull [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
   while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }
        return -1;
    }
}

