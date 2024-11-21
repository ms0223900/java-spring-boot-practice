package com.leetcode;

public class TakeCharacters {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] count = new int[3];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        if (Math.min(count[0], Math.min(count[1], count[2])) < k) {
            return -1;
        }

        int[] currentCount = new int[3];
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            currentCount[s.charAt(right) - 'a']++;

            while (left <= right && (currentCount[0] > count[0] - k || currentCount[1] > count[1] - k
                    || currentCount[2] > count[2] - k)) {
                currentCount[s.charAt(left) - 'a']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return n - maxLength;
    }
}
