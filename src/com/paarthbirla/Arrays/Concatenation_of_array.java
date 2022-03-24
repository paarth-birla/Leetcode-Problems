package com.paarthbirla.Arrays;

import java.util.Arrays;

public class Concatenation_of_array {
    public static int[] concatenate(int[] nums)
    {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(concatenate(nums)));
    }
}
