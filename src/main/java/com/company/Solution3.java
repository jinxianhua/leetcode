package com.company;

import java.util.*;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring3("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        List<Byte> list = new ArrayList<>();
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            list.add(bytes[i]);
            for (int j = i + 1; j < bytes.length; j++) {
                if (list.contains(bytes[j])) {
                    l = l > list.size() ? l : list.size();
                    list = new ArrayList<>();
                    break;
                } else {
                    list.add(bytes[j]);
                }
            }
            l = l > list.size() ? l : list.size();
            list = new ArrayList<>();
        }
        return l;
    }

    public int lengthOfLongestSubstring2(String s) {
        int l = 0;
        Set<Character> list = new HashSet<>();
        char[] bytes = s.toCharArray();
        for (int i = 0; i < bytes.length; i++) {
            list.add(bytes[i]);
            for (int j = i + 1; j < bytes.length; j++) {
                if (list.contains(bytes[j])) {
                    l = l > list.size() ? l : list.size();
                    list = new HashSet<>();
                    break;
                } else {
                    list.add(bytes[j]);
                }
            }
            l = l > list.size() ? l : list.size();
            list = new HashSet<>();
        }
        return l;
    }

    public int lengthOfLongestSubstring3(String s) {
        List<Character> characters = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int i = characters.indexOf(c);
            if (i >= 0) {
                characters = characters.subList(i+1, characters.size());
            }
            characters.add(c);
        }
        return characters.size();
    }
}

