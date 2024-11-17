package com.leetcode;

public class ShortestSubArr {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length, left = 0, right = n - 1;
        while (left + 1 < n && arr[left] <= arr[left + 1])
            ++left;
        if (left == n - 1)
            return 0;
        while (right > left && arr[right - 1] <= arr[right])
            --right;
        int res = Math.min(n - left - 1, right);
        for (int i = 0, j = right; i <= left && j < n;)
            if (arr[i] <= arr[j])
                res = Math.min(res, j - i++ - 1);
            else
                ++j;
        return res;
    }
}
