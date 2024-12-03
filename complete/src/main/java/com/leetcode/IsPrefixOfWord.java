package com.leetcode;

public class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public int isPrefixOfWord2(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= searchWord.length()) {
                if (words[i].substring(0, searchWord.length()).equals(searchWord)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
