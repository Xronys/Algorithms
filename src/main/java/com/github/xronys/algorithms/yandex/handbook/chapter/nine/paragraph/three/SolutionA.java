package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SolutionA {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int q = Integer.parseInt(reader.readLine());
            for (int i = 0; i < q; i++) {
                String[] line = reader.readLine().split(" ");
                if(Integer.parseInt(line[0]) == 1) {
                    map.put(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                } else if (Integer.parseInt(line[0]) == 2) {
                    if(map.containsKey(Integer.parseInt(line[1]))) {
                        System.out.println(map.get(Integer.parseInt(line[1])));
                    }
                    else {
                        System.out.println("-1");
                    }
                }
            }
        }
    }
}
