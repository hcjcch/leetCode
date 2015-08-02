package com.hcjcch.RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;

        int j = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                i++;
            } else {
                j++;
                nums[j] = nums[i];
                i++;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, j + 1);
        for (int a : nums) {
            System.out.print(a + " ");
        }
        System.out.println();
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{1,2};
        System.out.println(removeDuplicates(arrays));
    }
}