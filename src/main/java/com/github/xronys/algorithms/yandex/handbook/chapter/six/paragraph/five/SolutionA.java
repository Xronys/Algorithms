package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.five;

import java.io.*;

public class SolutionA {
    public static int solve(int n) {
        int k = 0;
        int sum = 0;
        int step = 1;
        while(sum < n) {
            sum += step;
            step++;
            if(sum <= n)
            k++;
        }
        return k;
    }



    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            writer.write(String.valueOf(solve(n)));
        }
    }
}
