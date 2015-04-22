package com.hcjcch.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (maps.containsKey(target - numbers[i])) {
                index[0] = maps.get(target - numbers[i]);
                index[1] = i+1;
                return index;
            } else {
                if (!maps.containsKey(numbers[i])) {
                    maps.put(numbers[i], i+1);
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] index;
        index = twoSum(numbers, target);
        assert index != null;
        for (int anIndex : index) {
            System.out.println(anIndex);
        }
    }
}