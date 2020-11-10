package com.company;

import java.security.Principal;
import java.util.Arrays;

/**
 * 4. 寻找两个正序数组的中位数
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * <p>
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 示例 3：
 * <p>
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * 示例 4：
 * <p>
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * 示例 5：
 * <p>
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 * <p>
 * <p>
 * 提示：
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] k = new int[nums1.length + nums2.length];
        for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
            if (i >= nums1.length && j < nums2.length) {
                k[i + j] = nums2[j];
                j++;
                continue;
            }
            if (j >= nums2.length && i < nums1.length) {
                k[i + j] = nums1[i];
                i++;
                continue;
            }

            if (nums1[i] <= nums2[j]  ) {
                k[i + j] = nums1[i];
                i++;
                continue;
            }
            if (nums1[i] > nums2[j]) {
                k[i + j] = nums2[j];
                j++;
                continue;
            }
        }
        return (k.length % 2) == 1 ? (k[k.length / 2]) : (double)( k[k.length / 2] + k[k.length / 2 - 1]) / 2;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
