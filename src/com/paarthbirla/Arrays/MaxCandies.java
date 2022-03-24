package com.paarthbirla.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {

    public static void main(String[] args) {
        int[] candy = {4,2,1,1,2};
        System.out.println(maxCandies(candy, 1));
        System.out.println(maxCandies2(candy, 1));
    }

    public static List<Boolean> maxCandies(int[] candies, int extraCandies)
    {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(isMax(candies[i] + extraCandies, candies));
        }

        return result;
    }

    public static boolean isMax(int candy, int[] candies)
    {
        for(int candys : candies)
        {
            if(candy < candys)
            {
                return false;
            }
        }
        return true;
    }

    public static List<Boolean> maxCandies2(int[] candies, int extraCandies)
    {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        for (int candy : candies) {
            if(candy+extraCandies >= max)
            {
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }

        return ans;
    }
}
