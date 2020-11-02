package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kim 金仙华
 * @date 2020/10/22
 */
public class Solution3 {
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
                l = l > list.size() ? l : list.size();
                list = new ArrayList<>();
            }
        }

        return l;
    }
}

