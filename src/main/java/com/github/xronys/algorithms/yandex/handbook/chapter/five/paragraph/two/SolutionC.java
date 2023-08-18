package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.two;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionC {
    public static void solve( long n ) {
     List<Long> result = new ArrayList(Arrays.asList(0l,1l));
        if (n <= 1) {
            System.out.print(result.get(1) + " " + result.get(1));

        }
        else {
              for(int i = 2; i < Integer.MAX_VALUE; i++) {
                  long count = result.get(i - 1) + result.get(i - 2);
                  if (count > n) {
                      break;
                  }
                  result.add(count);
            }
            System.out.print(result.get(result.size() - 2) + " " + result.get(result.size() - 1));
        }
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            long n = Integer.parseInt(reader.readLine());
            solve(n);
        }
    }
}
