package com.leetcode;

public class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < goal.length(); i++) {
            if (s.contains(goal.substring(i)) && s.contains(goal.substring(0, i))) {
                return true;
            }
        }
        return false;
    }
}