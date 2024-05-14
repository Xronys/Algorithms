package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class SolutionA {
    public static int [] nArray;
    public  static List<Integer> result = new ArrayList<Integer>();
    public static int solve(int n) {
    for(int i = 2; i <= n; i++) {
        nArray[i - 1] = 1 + nArray[i - 2];
        if (nArray[i -1] % 2 == 0) {
            if (nArray[i - 1] != 0 && nArray[i - 1] > 1 + nArray[(i - 1) / 2]) {
                nArray[i - 1] = 1 + nArray[(i - 1) / 2];
            }
        }
            if (nArray[i -1] % 3 == 0) {
                if (nArray[i -1] != 0 && nArray[i -1] > 1 + nArray[(i -1) / 3]) {
                    nArray[i -1] = 1 + nArray[(i -1) / 3];
                }
            }

        }
        return nArray[n - 1];
    }
    public static String resultNumber(int n) {
        int minusOne = Integer.MAX_VALUE;
        int dividedByTwo = Integer.MAX_VALUE;
        int dividedByThree = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        while (n > 1) {
            result.append(n + " ");
            minusOne = nArray[n - 2];
            if (n % 2 == 0) {
                dividedByTwo = nArray[(n - 1) / 2];
            }
            if (n % 3 == 0) {
                dividedByThree = nArray[(n - 1) / 3];
            }

            if (minusOne < dividedByTwo && n % 2 == 0) {
                if (minusOne < dividedByThree) {
                    n -= 1;
                }
                else {
                    n /= 3;
                }
            }
            else {
                if ( dividedByTwo< dividedByThree) {
                    n /= 2;
                }
                else {
                    n /= 3;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            nArray = new int[n];
            System.out.println(solve(n));
            System.out.println(resultNumber(n));
        }
    }
}

