package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.six;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SolutionA {

    public static String solve( List<String> numbers ) {
        StringBuilder stringBuilder = new StringBuilder();
        while (!numbers.isEmpty()) {
            if (numbers.size() > 1) {
                String max = numbers.get(0);
                int maxIndex = 0;
                for (int i = 1; i < numbers.size(); i++) {
                    String nextNumber = numbers.get(i);
                    if (isNextNumberBigger(max, nextNumber)) {
                        max = nextNumber;
                        maxIndex = i;
                    }
                }
                stringBuilder.append(max);
                numbers.remove(maxIndex);
            } else if (numbers.size() == 1) {
                stringBuilder.append(numbers.get(0));
                numbers.remove(0);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isNextNumberBigger( String max, String nextNumber ) {
        String maxNextNumber = max + nextNumber;
        String nextNumberMax = nextNumber + max;
        long maxLong = Long.parseLong(maxNextNumber);
        long nextNumberLong = Long.parseLong(nextNumberMax);
        if (maxLong < nextNumberLong) {
            return true;
        } else {
            return false;
        }
    }


    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            List<String> numbers = new ArrayList<>(List.of(reader.readLine().split(" ")));

            writer.write(solve(numbers));
        }
    }
}
