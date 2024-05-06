package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.four;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionB {

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str1[] = reader.readLine().split(" ");
            String str2[] = reader.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int l = Integer.parseInt(str1[1]);
            int count = 1;
            List<Integer> points = new ArrayList<>();
            for(int i = 0; i < str2.length; i++) {
                points.add(Integer.parseInt(str2[i]));
            }
            Collections.sort(points);
            int current = points.get(0);
            for(int i = 1; i < n; i++) {
                if(points.get(i) - current > l) {
                    count++;
                    current = points.get(i);
                }
            }
            System.out.println(count);

        }
    }
}