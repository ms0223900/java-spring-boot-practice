package com.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxEqualRowsAfterFlips {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            StringBuilder key = new StringBuilder();

            for (int j = 0; j < row.length; j++) {
                int bit = row[j];
                if (row[0] == 0) {
                    key.append(bit);
                } else {
                    key.append(bit ^ 1);
                }
            }
            map.merge(key.toString(), 1, Integer::sum);
        }

        return Collections.max(map.values());
    }
}
