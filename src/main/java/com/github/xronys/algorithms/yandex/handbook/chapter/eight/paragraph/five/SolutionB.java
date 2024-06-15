package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionB {
    public static int solve(long[] str1Numbers, long[] str2Numbers, long [] str3Numbers) {
        int pointer2 = 0;
        int pointer3 = 0;
        List<Integer> result = new ArrayList<>();
        for(int u = 0; u < str1Numbers.length; u++) {
            pointer2 = 0;
            pointer3 = 0;
            int temp = 0;
         for (int i = u; i < str1Numbers.length; i++) {
             outerloop:
             for (int j = pointer2; j < str2Numbers.length; j++) {
                 if (str1Numbers[i] == str2Numbers[j]) {
                     for (int k = pointer3; k < str3Numbers.length; k++) {
                         if (str1Numbers[i] == str3Numbers[k]) {
                             pointer3 = k + 1;
                             pointer2 = j + 1;
                             temp++;
                             break outerloop;
                         }
                         if (k == str3Numbers.length - 1) {
                             break outerloop;
                         }
                     }
                 }
             }
         }
            result.add(temp);
         }

        return Collections.max(result);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            String[] str1 = reader.readLine().split(" ");
            long [] str1Numbers = new long[n];
            for(int i = 0; i < str1.length; i++) {
                str1Numbers[i] = Long.parseLong(str1[i]);
            }
            int n2 = Integer.parseInt(reader.readLine());
            String[] str2 = reader.readLine().split(" ");
            long [] str2Numbers = new long[n2];
            for(int i = 0; i < str2.length; i++) {
                str2Numbers[i] = Long.parseLong(str2[i]);
            }
            int n3 = Integer.parseInt(reader.readLine());
            String[] str3 = reader.readLine().split(" ");
            long [] str3Numbers = new long[n3];
            for(int i = 0; i < str3.length; i++) {
                str3Numbers[i] = Long.parseLong(str3[i]);
            }
            System.out.print(solve(str1Numbers, str2Numbers, str3Numbers));
        }
    }
}