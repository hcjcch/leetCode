package com.hcjcch.longestcommonprefix;

/**
 * Created by hcjcch on 15/7/21.
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;
        if (strs.length == 0){
            return "";
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                len = strs[i].length();
            }
        }
        String result = "";
        for (int i = 0; i < len; i++) {
            char a = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != a) {
                    return result;
                }
            }
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"aabcdef","aabddd","aabdd","akimdi"};
        System.out.println(longestCommonPrefix(strings));
    }
}