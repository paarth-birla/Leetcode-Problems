package com.paarthbirla;

import java.util.Arrays;
import java.util.Scanner;

/*
Question :
        Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
        for each 0 <= i < nums.length and return it.

        A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
*/

public class Build_array_from_permutation {

    public static int[] buildArray(int[] nums)
    {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
