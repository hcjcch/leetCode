package com.hcjcch.reverseinteger;

public class Solution {
    public static int reverse(int x) {
        int temp = 0;
        while (x != 0){
            if (temp != 0 && Math.abs(Integer.MAX_VALUE / temp) < 10)
                return 0;
            temp = (temp * 10) + (x % 10);
            x = x / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(-12345%10);
//        System.out.println(reverse(1000000003));
        System.out.println(reverse(-12345));
//        System.out.println(reverse(100));
//        System.out.println(-4321 / 523);
    }
}