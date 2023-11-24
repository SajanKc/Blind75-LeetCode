package com.iamsajan.sequences;

/*
DAY 3 : EASY
Question: https://leetcode.com/problems/contains-duplicate
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1}; // true
        int[] nums2 = {1, 2, 3, 4}; // false
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println("Contains Duplicate: {1, 2, 3, 1} : " + containsDuplicate.containsDuplicate(nums1));
        System.out.println("Contains Duplicate: {1, 2, 3, 4} : " + containsDuplicate.containsDuplicate(nums2));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num))
                return true;
            numSet.add(num);
        }

        return false;
    }
}
