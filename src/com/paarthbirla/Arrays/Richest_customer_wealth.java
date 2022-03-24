package com.paarthbirla.Arrays;

/*
Question:
        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
        ith customer has in the jth bank. Return the wealth that the richest customer has.

        A customer's wealth is the amount of money they have in all their bank accounts.
        The richest customer is the customer that has the maximum wealth.
*/

public class Richest_customer_wealth {

    public static int maximumWealth(int[][] accounts)
    {
        int max = 0;
        int sum;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum)
            {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {1,2,3}};
        System.out.println(maximumWealth(accounts));
    }
}
