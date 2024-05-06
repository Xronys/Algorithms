package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.two;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class SolutionB {

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            String numbers[] = reader.readLine().split(" ");
            Map<Integer, Integer> numbersMap = new TreeMap<>();

            for (int i = 0; i < numbers.length; i++) {
                int temp = Integer.parseInt(numbers[i]);
                if (numbersMap.containsKey(temp))
                    numbersMap.put(temp, numbersMap.get(temp) + 1);
                else
                    numbersMap.put(temp, 1);
            }
            int result = 0;
            for (var entry : numbersMap.entrySet()
            ) {
                if (entry.getValue() > n / 4) {
                    result++;
                }
            }
            if (result == 3)
                writer.write("1");
            else
                writer.write("0");
        }
    }
}
