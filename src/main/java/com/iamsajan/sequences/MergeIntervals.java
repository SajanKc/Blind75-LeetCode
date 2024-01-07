package com.iamsajan.sequences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/*
DAY 8 : MEDIUM
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of
the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals2 = {{1, 5}, {4, 5}};
        int[][] intervals3 = {{4, 6}, {11, 13}, {7, 9}, {2, 5}, {13, 16}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        System.out.println("Ans1: " + Arrays.deepToString(mergeIntervals.merge(intervals1)));
        System.out.println("Ans2: " + Arrays.deepToString(mergeIntervals.merge(intervals2)));
        System.out.println("Ans3: " + Arrays.deepToString(mergeIntervals.merge(intervals3)));
    }

    public int[][] merge(int[][] intervals) {
        // sort the array
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> ans = new LinkedList<>();


        for (int[] interval : intervals) {
            // no overlapping
            if (ans.isEmpty() || ans.getLast()[1] < interval[0]) {
                ans.add(interval);
            } else {
                // overlapping
                ans.getLast()[1] = Math.max(ans.getLast()[1], interval[1]);
            }
        }
        // converting LinkedList to 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}
