package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.one;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class SolutionC {

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int k = Integer.parseInt(reader.readLine());
            String numbers[] = reader.readLine().split(" ");
            int m = Integer.parseInt(reader.readLine());
            Map<Integer, Integer> numbersMap = new TreeMap<>();
            int numbersForSearch[] = new int[m];
            String numbersForSearchStr[] = reader.readLine().split(" ");
            for (int i = 0; i < numbers.length; i++) {
                int temp = Integer.parseInt(numbers[i]);
                if (numbersMap.containsKey(temp))
                    numbersMap.put(temp, numbersMap.get(temp) + 1);
                else
                    numbersMap.put(temp, 1);
            }
            for (int i = 0; i < m; i++) {
                numbersForSearch[i] = Integer.parseInt(numbersForSearchStr[i]);
            }
            for (int i = 0; i < numbersForSearch.length; i++) {
                int q = numbersForSearch[i];
                if (numbersMap.containsKey(q))
                    writer.write(numbersMap.get(q) + "\n");
                else
                    writer.write(0 + "\n");
            }
        }
    }
}
