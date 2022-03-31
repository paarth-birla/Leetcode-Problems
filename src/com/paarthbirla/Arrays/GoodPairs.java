package com.paarthbirla.Arrays;

//https://leetcode.com/problems/number-of-good-pairs/

public class GoodPairs {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(goodPairs(nums));
    }

    static int goodPairs(int[] nums)
    {
        int pairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                {
                    pairs ++;
                }
            }
        }

        return pairs;
    }
}
