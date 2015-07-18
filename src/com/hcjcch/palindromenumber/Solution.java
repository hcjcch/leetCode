package com.hcjcch.palindromenumber;

/**
 * Created by hcjcch on 15/7/18.
 */
public class Solution {
    public static boolean isPalindrome(int x) {
        int temp = 0, a = x;
        while (a > 0) {
            temp = temp * 10 + a % 10;
            a = a / 10;
        }
        return temp == x;
    }

    public static boolean isPalindrom2(int x) {
        int a = x;
        int h = 1;
        if (x < 0){
            return false;
        }
        while (a / h >= 10) {
            h = h * 10;
        }
        while (a > 0) {
            if (a / h != a % 10) return false;
            a = a % h;
            a = a / 10;
            h = h / 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrom2(1234554321));
    }
}
