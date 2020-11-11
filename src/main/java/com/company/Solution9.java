package com.company;

/**
 * @author kim 金仙华
 * @date 2020/11/11
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int k=0,y=x;
        while (y!=0){
            k=k*10+y%10;
            y=y/10;
        }
        return k==x;
    }

    public static void main(String[] args) {
        Solution9 solution9=new Solution9();
       System.out.println(solution9.isPalindrome(121));
    }
}
