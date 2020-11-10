package com.company;


/**
 * @author kim 金仙华
 * @date 2020/11/10
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        char[] sc = s.toCharArray();
        int x = numRows == 1 ? sc.length : (sc.length / 2 + 1);
        char[][] chars = new char[numRows][x];
        int k = 0;
        for (int j = 0; j < x; j++) {
            int i = 0;
            for (; i < numRows; i++) {
                if (k >= sc.length) {
                    break;
                }
                chars[i][j] = sc[k++];
            }
            if (k >= sc.length) {
                break;
            }
            for (i = i - 2; i >= 1; i--) {
                j++;
                if (k >= sc.length) {
                    break;
                }
                chars[i][j] = sc[k++];
            }
            if (k >= sc.length) {
                break;
            }
        }
        char[] re = new char[sc.length];
        k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < x; j++) {
                if (chars[i][j] != '\0') {
                    re[k++] = chars[i][j];
                }
            }
        }
        return String.valueOf(re);
    }


    public String convert2(String s, int numRows) {
        char[] sc = s.toCharArray();
        int x = numRows == 1 ? sc.length : (sc.length / (numRows - 1) + 1);
        Character[][] chars = new Character[numRows][x];
        int k = 0;
        for (int j = 0; j < x; j++) {
            int i = 0;
            for (; i < numRows; i++) {
                if (k >= sc.length) {
                    break;
                }
                chars[i][j] = sc[k++];
            }
            if (numRows == 1 || numRows == 2) {
                continue;
            }
            j++;
            if (j >= x) {
                break;
            }
            for (i = i - 2; i >= 1; i--) {
                if (k >= sc.length) {
                    break;
                }
                chars[i][j] = sc[k++];
            }
        }
        char[] re = new char[sc.length];
        k = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < x; j++) {
                if (chars[i][j] != null) {
                    re[k++] = chars[i][j];
                }
            }
        }
        return new String(re);
    }


    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.convert2("AB", 1));
    }
}
