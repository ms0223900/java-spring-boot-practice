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

    public int[] decrypt2(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }

        if (k > 0) {
            for (int j = 1; j <= k; j++) {
                result[0] += code[(j) % n];
            }
        } else {
            for (int j = n - 1; j >= n + k; j--) {
                int index = (j + n) % n;
                result[0] += code[index];
            }
        }

        for (int i = 1; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                int index = (i + k) % n;
                sum = result[i - 1] - code[i] + code[index];
            } else {
                int prevIdx = (i - 1 + k + n) % n;
                int index = i - 1;
                sum = result[i - 1] - code[prevIdx] + code[index];
            }
            result[i] = sum;
        }

        return result;
    }
}
