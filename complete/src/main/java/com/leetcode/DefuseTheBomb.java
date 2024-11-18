package com.leetcode;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = i - 1; j >= i + k; j--) {
                    int index = (j + n) % n;
                    sum += code[index];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
