package com.hcjcch.romantointeger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hcjcch on 15/7/18.
 */
public class Solution {


    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = s.length();
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1) {
                result = map.get(chars[i]);
                continue;
            }
            if (map.get(chars[i]) >= map.get(chars[i + 1])) {
                result = result + map.get(chars[i]);
            } else {
                result = result - map.get(chars[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXC"));
        System.out.println(romanToInt("MCMLXXXIV"));
    }
}
