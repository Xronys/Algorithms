package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.two;


import java.io.*;

public class SolutionB {
    public static long solve( long a, long b ) {
        while (a > 0 & b > 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] str = reader.readLine().split(" ");
            long a = Integer.parseInt(str[0]);
            long b = Integer.parseInt(str[1]);
            writer.write(String.valueOf( (a * b) / solve(a, b)));
        }
    }
}

