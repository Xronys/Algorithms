package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionA {
    public static int count = 0;

    public static void solveCount( int n, int k1, int k2, int k3, int num ) {
        if (n == 0) {
            count++;
            return;
        }
        if (num == 10 && n >= 10)
            solveCount(n - 10, k1 + 1, k2, k3, 10);
        if (num > 1 && n >= 5)
            solveCount(n - 5, k1, k2 + 1, k3, 5);
        solveCount(n - 1, k1, k2, k3 + 1, 1);

    }

    public static void solve4( int n, int k1, int k2, int k3, int num ) {
        if (n == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            System.out.print(k1 + k2 + k3 + " ");
            for (int i = 0; i < k1; i++) {
                if (i + 1 == k1 && k2 == 0 && k3 ==0)
                    stringBuilder.append(10);
                else
                   stringBuilder.append(10 + " ");

            }
            for (int j = 0; j < k2; j++) {
                if (j + 1 == k2 && k3 == 0)
                   stringBuilder.append(5);
                else
                   stringBuilder.append(5 + " ");

            }
            for (int r = 0; r < k3; r++) {
                if (r + 1 == k3)
                   stringBuilder.append(1);
                else
                    stringBuilder.append(1 + " ");

            }
            System.out.println(stringBuilder);
            return;
        }
        if (num == 10 && n >= 10)
            solve4(n - 10, k1 + 1, k2, k3, 10);
        if (num > 1 && n >= 5)
            solve4(n - 5, k1, k2 + 1, k3, 5);
        solve4(n - 1, k1, k2, k3 + 1, 1);

    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            solveCount(n, 0, 0, 0, 10);
            System.out.println(count);
            solve4(n, 0, 0, 0, 10);
        }
    }
}