package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.two;

import java.io.*;

public class SolutionA {

    public static int solve(int a, int b) {
        return a + b;
    }

    public static void main( String args[] ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] s = reader.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            writer.write(String.valueOf(solve(a,b)));
        }
    }
}


