package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SolutionA {
    public static int [] moneyArray;
    public static int solve(int money) {
        ArrayList<Integer> denomination = new ArrayList<>();
        denomination.add(1);
        denomination.add(3);
        denomination.add(4);
        if (money == 0) {
            return 0;
        }
         for(int j = 0; j < money; j++)
            if (moneyArray[j] == 0 ) {
                int result = Integer.MAX_VALUE;
                  for (int i = 0; i < denomination.size(); i++) {
                      if (denomination.get(i) <= money) {
                          if (1 + solve(money - denomination.get(i)) < result) {
                              result = 1 + solve(money - denomination.get(i));
                              moneyArray[money - 1] = result;
                          }
                      }
                      }
              }
        return moneyArray[money - 1];
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int money = Integer.parseInt(reader.readLine());
            moneyArray = new int[money];
            System.out.println(solve(money));
        }
    }
}
