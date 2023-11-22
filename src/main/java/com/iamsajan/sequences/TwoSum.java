package com.iamsajan.sequences;

import java.util.HashMap;
import java.util.Map;

/*
Question: https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 8, 11, 15, 3, 6, 9};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToTarget = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (numToTarget.containsKey(target - nums[i])) {
                return new int[]{numToTarget.get(target - nums[i]), i};
            }
            numToTarget.put(nums[i], i);
        }
        return new int[]{};
    }

}