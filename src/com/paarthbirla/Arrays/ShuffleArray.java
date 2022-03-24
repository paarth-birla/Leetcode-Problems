package com.paarthbirla.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/

public class ShuffleArray {
    public static void main(String[] args) {
        int[] matrix = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(matrix, 3)));
    }

    public static int[] shuffle(int[] nums, int n)
    {
        int[] ans = new int[nums.length];

//        for (int i = 0; i < nums.length; i++) {
//            if(i%2 == 0)
//            {
//                ans[i] = nums[i/2];
//            }
//            else
//            {
//                ans[i] = nums[n+i/2];
//            }
//        }
        for (int i = 0, j =0; i < n; i++, j += 2) {
            ans[j] = nums[i];
            ans[j+1] = nums[n+i];
        }

        return ans;
    }
}

