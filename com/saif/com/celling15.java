package com.saif.com;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class celling15 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans =celling (arr,target);
        System.out.println(ans);
    }







//celling means = smallest number greater then=> = target
    static int celling(int  [] arr, int target){
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
        return start;
    }
}

