package com.leetcode;

public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        return words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0);
    }

    public boolean isCircularSentence2(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
