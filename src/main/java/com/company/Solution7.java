package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Solution7 {
    public int reverse(int x) {
        List<Integer> stack = new ArrayList<>();
        for (int y = x; y != 0; y = y / 10) {
            stack.add(y % 10);
        }
        long k = 0;
        for (Integer e : stack) {
            k = k * 10 + e;
        }
        return k > Integer.MAX_VALUE || k < Integer.MIN_VALUE ? 0 : (int) k;
    }


    public int reverse2(int x) {
        long rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ? 0 : (int) rev;
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverse2(1056389759));

    }
}
