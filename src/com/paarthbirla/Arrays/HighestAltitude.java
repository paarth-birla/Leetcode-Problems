package com.paarthbirla.Arrays;

//https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain)
    {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        int largestAlt = altitudes[0];
        for (int i = 1; i < altitudes.length; i++) {
            altitudes[i] = altitudes[i-1] + gain[i-1];
            if(largestAlt < altitudes[i])
            {
                largestAlt = altitudes[i];
            }
        }
        return largestAlt;
    }
}
