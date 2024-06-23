package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SolutionB {
    public static void main (String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Set<Integer> set = new HashSet<>();
            int result = 0;
            int n = Integer.parseInt(reader.readLine());
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = reader.readLine();
            }
            for (int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int count = 0;
                    for(int k = 0; k < strings[i].length(); k++) {
                        if(strings[i].charAt(k) != strings[j].charAt(k)) {
                            count++;
                        }
                        if(count == 1 && k == strings[i].length() - 1) {
                            result++;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
