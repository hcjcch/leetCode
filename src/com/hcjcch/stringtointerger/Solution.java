package com.hcjcch.stringtointerger;

public class Solution {
    public static int myAtoi2(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        str = str.trim();
        double temp = 0;
        char flag = '+';
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            temp = temp * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (flag == '-') {
            temp = -temp;
        }
        if (temp > Integer.MAX_VALUE) {
            temp = Integer.MAX_VALUE;
        }
        if (temp < Integer.MIN_VALUE) {
            temp = Integer.MIN_VALUE;
        }
        return (int) (temp);
    }

    public static int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        str = str.trim();
        int temp = 0;
        char flag = '+';
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (temp != 0 && flag == '-' && Integer.MIN_VALUE / temp >= -10) {
                return Integer.MIN_VALUE;
            }
            if (temp != 0 && flag == '+' && Integer.MAX_VALUE / temp <= 10) {
                return Integer.MAX_VALUE;
            }
            temp = temp * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (flag == '-')
            temp = -temp;
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(-2147483648 /214748364 );
        System.out.println(myAtoi("-2147483647"));
        System.out.println(myAtoi2("2147483648"));
    }
}