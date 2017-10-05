package com.company;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {
    public static void search(String pat, String txt) {
        Map<Character, Integer> mt = new HashMap<Character, Integer>();
        for (int i = 0; i < pat.length(); i++) {
            mt.put(pat.charAt(i), i);
        }
        int skip = 0;
        int N = txt.length();
        int M = pat.length();
        for (int i = 0; i <= N - M; i = i + skip) {

            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    if (mt.get(txt.charAt(i + j)) != null) {
                        skip = Math.max(1, j - mt.get(txt.charAt(i + j)));
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

