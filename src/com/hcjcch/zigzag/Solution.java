package com.hcjcch.zigzag;

public class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        int size = numRows * 2 - 2;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += size) {
                builder.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && j + size - 2 * i < s.length()) {
                    builder.append(s.charAt(j + size - 2 * i));
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("A", 1));
    }
}