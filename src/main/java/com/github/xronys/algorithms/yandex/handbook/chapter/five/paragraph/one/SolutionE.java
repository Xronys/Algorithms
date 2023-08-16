package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.one;

import java.io.*;

public class SolutionE {
    public static long solve(long n ) {
        if (n <= 1) {
            return n;
        }
        n += 2;
        n = n % 60;
        long previous = 0;
        long current = 1;
        if(n == 0)
        {
            current = 0;
        }
        for (long i = 0; i < n - 1; i++) {
            long oldPrevious = previous;
            previous = current;
            current = (oldPrevious + previous) % 10;
        }
        if(current == 0)
            return 9;
        return current - 1;
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] str = reader.readLine().split(" ");
            long m = Long.parseLong(str[0]);
            long n = Long.parseLong(str[1]);
            long nSum = solve(n);
            long mSum = solve(m - 1);
                if(m > 0) {
                    writer.write(String.valueOf(((10 + nSum) - mSum) % 10));
                }
                else {
                    writer.write(String.valueOf(nSum - m));
                }

        }
    }
}
