package com.hcjcch.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
        String s = "";
        return generate(n,n,s,list);
    }

    public static ArrayList<String> generate(int leftNum, int rightNum, String s, ArrayList<String> list) {
        if (leftNum == 0 && rightNum == 0) {
            list.add(s);
        }
        if (leftNum > 0) {
            generate(leftNum - 1, rightNum, s + "(", list);
        }
        if (rightNum > 0 && rightNum > leftNum) {
            generate(leftNum, rightNum - 1, s + ")", list);
        }
        return list;
    }
}