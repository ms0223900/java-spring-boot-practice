package com.leetcode;

class CompressedString {
    public String compressedString(String word) {
        StringBuilder compressed = new StringBuilder();
        char currentChar = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            char character = word.charAt(i);
            if (currentChar == character && count < 9) {
                count++;
            } else {
                compressed.append(count).append(currentChar);
                currentChar = character;
                count = 1;
            }
        }
        compressed.append(count).append(currentChar);
        return compressed.toString();
    }
}