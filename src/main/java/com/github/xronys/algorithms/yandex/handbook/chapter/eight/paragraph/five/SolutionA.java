package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionA {
    public static int solve(int[] str1Numbers, int[] str2Numbers) {
       
        int [][] result = new int[str1Numbers.length + 1][str2Numbers.length + 1];
        for(int i = 0; i <= str1Numbers.length; i++) {
            result[i][0] = i;
        }
        for(int i = 0; i <= str2Numbers.length; i++) {
            result[0][i] = i;
        }
        for(int i = 1; i <= str1Numbers.length; i++) {
            for(int j = 1; j <= str2Numbers.length; j++) {
                int insertion = result[i][j - 1] + 1;
                int deletion = result[i - 1][j] + 1;
                int match = result[i - 1][j - 1];
                if(str1Numbers[i - 1] == str2Numbers[j - 1]) {
                    result[i][j] = Math.min(insertion,Math.min(deletion, match));
                }
                else {
                    result[i][j] = Math.min(insertion,deletion);
                }
            }
        }

        return (str1Numbers.length + str2Numbers.length - result[str1Numbers.length][str2Numbers.length] ) / 2;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            String[] str1 = reader.readLine().split(" ");
            int [] str1Numbers = new int[n];
            for(int i = 0; i < str1.length; i++) {
               str1Numbers[i] = Integer.parseInt(str1[i]);
            }
            int n2 = Integer.parseInt(reader.readLine());
            String[] str2 = reader.readLine().split(" ");
            int [] str2Numbers = new int[n2];
            for(int i = 0; i < str2.length; i++) {
                str2Numbers[i] = Integer.parseInt(str2[i]);
            }
            System.out.print(solve(str1Numbers, str2Numbers));
        }
    }
}
