package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.three;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionA {
    public static long solve(List<Integer> numbersList) {
        long result = (long)numbersList.get(numbersList.size() - 1) * numbersList.get(numbersList.size() - 2);
        return result;
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int a = Integer.parseInt(reader.readLine());
            String[] numbers = reader.readLine().split(" ");
            List<Integer> numbersList = new ArrayList<>();
            for(int i = 0; i < a; i++) {
                numbersList.add(Integer.parseInt(numbers[i]));
            }
            Collections.sort(numbersList);
            writer.write(String.valueOf(solve(numbersList)));
        }
    }
}
