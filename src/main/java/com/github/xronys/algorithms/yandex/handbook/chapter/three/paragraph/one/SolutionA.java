package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.one;

import java.io.*;


public class SolutionA {
    public static long solve(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            writer.write(String.valueOf(solve(n)));
        }
    }
}
