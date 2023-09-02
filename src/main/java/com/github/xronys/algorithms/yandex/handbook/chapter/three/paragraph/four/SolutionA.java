package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.four;

import java.io.*;

public class SolutionA {
    public static void solve(int n,  int fromPeg,  int toPeg) {
        if(n == 1) {
            System.out.println(fromPeg + " " + toPeg);
            return;
        }

        int unusedPeg = 6 - fromPeg - toPeg;
        solve(n - 1, fromPeg, unusedPeg);
        System.out.println(fromPeg + " " + toPeg);
        solve(n-1,unusedPeg,toPeg);
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println((int) Math.pow(2,n) - 1);
           solve(n, 1,3);
        }
    }
}
