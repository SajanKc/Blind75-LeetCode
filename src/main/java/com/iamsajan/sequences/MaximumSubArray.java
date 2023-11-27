package com.iamsajan.sequences;

/*
DAY 5 : MEDIUM
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-1};
        int[] nums3 = {5, 4, -1, 7, 8};
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        System.out.println("Maximum Sub Array: " + maximumSubArray.maximumSubArray(nums1));
        System.out.println("Maximum Sub Array: " + maximumSubArray.maximumSubArray(nums2));
        System.out.println("Maximum Sub Array: " + maximumSubArray.maximumSubArray(nums3));

    }

    public int maximumSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
