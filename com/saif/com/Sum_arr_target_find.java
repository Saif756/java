package com.saif.com;

public class Sum_arr_target_find {
    int[] nums = {2,7,11,15};
    int target = 9;
        for (int i=0; i < nums.length; i++){
        for (int j=1; j<nums.length; j++){
            if (i!=j){
                if ((nums[i]+nums[j])==target){
                    // return {i, j};
                    System.out.println(i+" "+j +"hi");
                    break;

                }
            }
        }
    }
}
