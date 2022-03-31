package com.paarthbirla.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class NumberSmaller {
    static int[] smallerNumbers(int[] nums)
    {
        int[] answer = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j] && i != j)
                {
                    count ++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] answer = smallerNumbers(nums);
        System.out.println(Arrays.toString(answer));
    }
}
