package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.one;

import java.io.*;


public class SolutionB {
    public static long solve(int n, int k) {
        int nf = 1;
        int kf = 1;
        int  nkf = 1;
        int nk = n - k;
        for (int i = 1; i <= n; i++) {
            nf *= i;
        }
        for (int i = 1; i <= k; i++) {
            kf *= i;
        }
        for (int i = 1; i <= nk; i++) {
            nkf *= i;
        }
        return nf / (kf * nkf);
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] str = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            writer.write(String.valueOf(solve(n, k)));
        }
    }
}