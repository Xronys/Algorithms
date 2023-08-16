package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.one;

import java.io.*;

public class SolutionC {
    public static long solve(long n, int m ) {
        long current = 0;
        long next = 1;
        long period = 0;
        while(true) {
            long oldNext = next;
            next = (current + next) % m;
            current = oldNext;
            period = period + 1;
            if(current == 0 && next == 1) {
                break;
            }
        }
        n = n % period;
        if (n <= 1) {
            return n;
        }
        long previous = 0;
        current = 1;
        for (int i = 0; i < n - 1; i++) {
            long oldPrevious = previous;
            previous = current;
            current = (oldPrevious + previous) % m;
        }
        return current;
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] str = reader.readLine().split(" ");
            long n = Long.parseLong(str[0]);
            int m = Integer.parseInt(str[1]);
            writer.write(String.valueOf(solve(n, m)));
        }
    }
}
