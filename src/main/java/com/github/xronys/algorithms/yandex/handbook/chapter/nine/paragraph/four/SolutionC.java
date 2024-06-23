package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionC {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            int k = Integer.parseInt(reader.readLine());
            int[] numbers = new int[n];
            long result = 0L;
            String[] line = reader.readLine().split(" ");
            for(int i = 0; i < line.length; i++) {
                numbers[i] = Integer.parseInt(line[i]);
            }
            for (int i = 0; i < line.length; i++) {
                int min = numbers[i];
                if(i + k <= line.length) {
                    for(int j = 1; j < k; j++) {
                        int temp = numbers[i + j];
                        if (temp < min) {
                            min = temp;
                        }
                    }
                    result += min;
                }

            }
            System.out.println(result);
        }
    }
}
