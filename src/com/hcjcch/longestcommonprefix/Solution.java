package com.hcjcch.longestcommonprefix;

/**
 * Created by hcjcch on 15/7/21.
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;
        if (strs.length == 0) {
            return "";
        }
        int k = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                len = strs[i].length();
                k++;
            }
        }
        String result = "";
        for (int i = 0; i < len; i++) {
            char a = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                k++;
                if (strs[j].charAt(i) != a) {
                    System.out.println(k);
                    return result;
                }
            }
            result += a;
        }

        return result;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = "";
        int k = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                k++;
                if (strs[j].length() == i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    System.out.println(k);
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"abcdefghijklmnqv", "abcdefghijklmnqw", "abcdefghijklmnqr", "abcdefghijklmnqg"};
        System.out.println(longestCommonPrefix(strings));
        System.out.println(longestCommonPrefix2(strings));
    }
}