
package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class SolutionA {
  /*  public static Map<HashSet<Integer>, Integer> result = new HashMap<>();
    public static int max;
    public static int solve(HashMap<HashSet<Integer>, Integer> tempMap,int W, int[] goldenBar) {
        for (int i = 0; i < goldenBar.length; i++) {
            int temp = goldenBar[i];
            if (W - goldenBar[i] > 0) {

            } else if (W - goldenBar[i] == 0) {
                return W;
            }

            if (tempSet.contains(temp)) {}
        }

        return 0;
    }
    public static int maximumGoldWeight(int W, int[] weights) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                dp[i][w] = dp[i - 1][w];
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i][w], dp[i - 1][w - weights[i - 1]] + weights[i - 1]);
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str1 = reader.readLine().split(" ");
            String[] str2 = reader.readLine().split(" ");
            int w = Integer.parseInt(str1[0]);
            int n = Integer.parseInt(str1[1]);
            int[] goldenBar = new int[n];
            for (int i = 0; i < str2.length; i++) {
                goldenBar[i] = Integer.parseInt(str2[i]);
            }
            System.out.println(maximumGoldWeight(w, goldenBar));
        }
    }*/
}


