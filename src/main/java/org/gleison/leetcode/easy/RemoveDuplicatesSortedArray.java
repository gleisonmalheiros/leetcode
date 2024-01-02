package org.gleison.leetcode.easy;

/**
 * #26
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        java.util.Arrays.sort(nums); // making sure the array is sorted
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Integer.MAX_VALUE) {

                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        nums[j] = Integer.MAX_VALUE;
                    } else {
                        break;
                    }
                }

                res++;
            }
        }

        java.util.Arrays.sort(nums);
        return res;
    }

}
