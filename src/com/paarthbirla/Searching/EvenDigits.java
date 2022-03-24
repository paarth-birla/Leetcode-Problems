package com.paarthbirla.Searching;

import java.util.Arrays;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int[] nums1 = {555, 901, 482, 1771};

        System.out.println(Arrays.toString(nums));
        System.out.println("Method 1: " + evenDigitsCount_method1(nums));
        System.out.println("Method 2: " + evenDigitsCount_method2(nums));

        System.out.println(Arrays.toString(nums1));
        System.out.println("Method 1: " + evenDigitsCount_method1(nums1));
        System.out.println("Method 2: " + evenDigitsCount_method2(nums1));
    }

    // finding digits of number by using divide and mod function
    static int evenDigitsCount_method1(int[] nums)
    {
        int count = 0;
        for (int num : nums)
        {
            if(countDigits(num) % 2 == 0)
            {
                count ++;
            }
        }
        return count;
    }

    static int countDigits(int num)
    {
        int count = 0;

        while(num > 0)
        {
            count ++;
            num = num/10;
        }
        return count;
    }

    // converting integer to String
    static int evenDigitsCount_method2(int[] nums)
    {
        int count = 0;

        for (int number : nums) {
            if(Integer.toString(number).length() % 2 == 0)
            {
                count ++;
            }
        }
        return count;
    }
}
