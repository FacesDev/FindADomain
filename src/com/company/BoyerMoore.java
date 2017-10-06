package com.company;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {
    public static void search(String line, String searchStr) {
        Map<Character, Integer> skippable = new HashMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++) {
            skippable.put(line.charAt(i), i);
        }
        int skip = 0;
        int N = searchStr.length();
        int M = line.length();
        for (int i = 0; i <= N - M; i = i + skip) {

            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (line.charAt(j) != searchStr.charAt(i + j)) {
                    if (skippable.get(searchStr.charAt(i + j)) != null) {
                        skip = Math.max(1, j - skippable.get(searchStr.charAt(i + j)));
                        System.out.println("skip " + skip);
                    } else
                        skip = j + 1;
                    break;
                }
            }
            if (skip == 0) {
                System.out.println("Match found at " + i);
                skip = 1;
            }
        }
    }
}

