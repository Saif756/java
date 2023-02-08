package com.saif.com;

import org.jetbrains.annotations.Contract;

public class Linearsearch {
    public static void main(String[] args) {

        int[] nums ={23,45,66,87,-1,45,-12,56,18};

        int target = 87;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
        // search in the array : return the index if item found
        // otherwise if item not found -1

    }
    static int linearSearch(int[]arr, int target) {
        if (arr.length ==0) {
            return-1;
        }

        // run a for loop

        for (int index =0; index < arr.length;index++){

            // check for element at evry index if it is = Target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        // this line execute if none of the execute none of the return above
        // hence the target not found

        return -1;


    }
}