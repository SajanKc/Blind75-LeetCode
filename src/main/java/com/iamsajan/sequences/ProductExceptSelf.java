package com.iamsajan.sequences;

import java.util.Arrays;

/*
DAY 4 : MEDIUM
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        System.out.println("Result Array 1: " + Arrays.toString(productExceptSelf.productExceptSelf(nums1)));
        System.out.println("Result Array 2: " + Arrays.toString(productExceptSelf.productExceptSelf(nums2)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];
        int pre = 1, post = 1;

        for (int i = 0; i < nums.length; i++) {
            productArray[i] = pre;
            pre = nums[i] * pre;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            productArray[i] = productArray[i] * post;
            post = nums[i] * post;
        }

        return productArray;
    }

}
