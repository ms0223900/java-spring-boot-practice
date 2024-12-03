package com.leetcode;

public class AddSpaces {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                sb.append(" ");
                spaceIndex++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String addSpaces2(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIndex = 0;
        for (int i = 0; i < spaces.length; i++) {
            sb.append(s.substring(spaceIndex, spaces[i])).append(" ");
            spaceIndex = spaces[i];
        }
        sb.append(s.substring(spaceIndex));
        return sb.toString();
    }

    public String addSpaces3(String s, int[] spaces) {
        int n = s.length();
        int m = spaces.length;
        char[] arr = new char[n + m];

        int stringIndex = 0;
        int arrIndex = 0;
        for (int space : spaces) {
            while (stringIndex < space) {
                arr[arrIndex++] = s.charAt(stringIndex++);
            }
            arr[arrIndex++] = ' ';
        }

        while (stringIndex < n) {
            arr[arrIndex++] = s.charAt(stringIndex++);
        }

        return new String(arr);
    }
}
