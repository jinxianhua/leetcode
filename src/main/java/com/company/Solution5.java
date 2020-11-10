package com.company;

/**
 * 5. 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int x = 0, y = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j > i && (j - i) > l; j--) {
                if (huiwen(i, j, chars) && (j - i) > l) {
                    l = j - i;
                    x = i;
                    y = j;
                }
            }
        }
        return s.substring(x, y + 1);
    }

    private boolean huiwen(int i, int j, char[] chars) {
        for (; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.longestPalindrome("babad"));
    }
}
