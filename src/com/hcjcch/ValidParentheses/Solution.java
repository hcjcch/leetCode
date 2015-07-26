package com.hcjcch.ValidParentheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arrays = s.toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == '(' || arrays[i] == '[' || arrays[i] == '{') {
                stack.push(arrays[i]);
            } else {
                if (arrays[i] == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                if (arrays[i] == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                if (arrays[i] == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("((()))"));
        System.out.println(isValid("(([]))"));
        System.out.println(isValid("({[]})"));
        System.out.println(isValid("([{]})"));
    }
}