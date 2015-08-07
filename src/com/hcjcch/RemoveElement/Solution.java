package com.hcjcch.RemoveElement;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        nums = Arrays.copyOfRange(nums, 0, j );
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + "   ");
        }
        System.out.println();
        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 3, 4, 5, 6, 2, 2, 2, 3}, 2));
    }
}