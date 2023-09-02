package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.three;

import java.io.*;

public class SolutionA {
    public static String solve(int n, int m) {
        if (n % 2 == 0 & m % 2 == 0) {
            return "Loose";
        }
        return "Win";
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] numbers = reader.readLine().split(" ");
            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);
            writer.write(solve(n, m));
        }
    }
}
