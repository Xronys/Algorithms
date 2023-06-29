package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.three;

import java.io.*;


public class SolutionB {
    public static void solve( int n) {
        double nDouble = n * 1.5;
        if(nDouble >= (((n - 2) *  2) + 1))
            System.out.println("No");
        else {
            System.out.println("Yes");
            System.out.print(n + " ");
            for(int i = 1; i < n; i++) {
                if(i == n - 1) {
                    System.out.print(i);
                }
                else {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            solve(n);
        }
    }
}
