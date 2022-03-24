package com.paarthbirla.Arrays;

import java.util.Arrays;

/*
Question:
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

        Return the running sum of nums.
*/

public class Running_sums {
    public static int[] runningSum(int[] nums)
    {
        int[] answer = new int[nums.length];
        answer[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] + nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
