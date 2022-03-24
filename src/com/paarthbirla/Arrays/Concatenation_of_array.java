package com.paarthbirla.Arrays;

import java.util.Arrays;

/*
Question:
        Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
        ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

        Specifically, ans is the concatenation of two nums arrays.

        Return the array ans.
*/

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
