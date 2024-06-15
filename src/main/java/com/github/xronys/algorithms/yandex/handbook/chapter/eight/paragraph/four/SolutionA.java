package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionA {
    public static int solve(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int [][] result = new int[chars1.length + 1][chars2.length + 1];
        for(int i = 0; i <= chars1.length; i++) {
            result[i][0] = i;
        }
        for(int i = 0; i <= chars2.length; i++) {
            result[0][i] = i;
        }
        for(int i = 1; i <= chars1.length; i++) {
            for(int j = 1; j <= chars2.length; j++) {
                int insertion = result[i][j - 1] + 1;
                int deletion = result[i - 1][j] + 1;
                int match = result[i - 1][j - 1];
                int mismatch =result[i - 1][j - 1] + 1;
                if(chars1[i - 1] == chars2[j - 1]) {
                    result[i][j] = Math.min(insertion,Math.min(deletion, match));
                }
                else {
                    result[i][j] = Math.min(insertion,Math.min(deletion, mismatch));
                }
            }
        }

        return result[chars1.length][chars2.length];
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
           String str1 = reader.readLine();
           String str2 = reader.readLine();
            System.out.println(solve(str1,  str2));
        }
    }
}
