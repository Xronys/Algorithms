package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.four;


import java.io.*;

public class SolutionB {

    public static int solve(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        var k = (int) (Math.sqrt(1 + 8 * n) - 1) / 2;
        return solve(n - k) * 2 + (int) Math.pow(2, k) - 1;
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            writer.write(String.valueOf(solve(n)));
        }
    }
}