package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.one;

import java.io.*;

public class SolutionB {
    public static long solve( int n ) {
        if (n <= 1)
            return n;
        long previous = 0;
        long current = 1;
        for (int i = 0; i < n - 1; i++) {
            long oldPrevious = previous;
            previous = current;
            current = (oldPrevious + previous) % 10;
        }
        return current;
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            writer.write(String.valueOf(solve(n)));
        }
    }
}
