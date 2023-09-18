package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.one;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SolutionB {
    private static List<Integer> denomination = new ArrayList<>();
    public static void solve(int n) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < denomination.size(); i++) {
            int temp = n / denomination.get(i);
            if( temp > 0) {
                for(int j = 0; j < temp; j++) {
                    result.add(denomination.get(i));
                }
                count += temp;
            }
            n %= denomination.get(i);
        }
        System.out.println(count);
       for(int i = 0; i < result.size(); i++) {
           if(i + 1 == result.size()) {
               System.out.print(result.get(i));
           }
           else {
               System.out.print(result.get(i) + " ");
           }
       }

    }

    static {
        denomination.add(50);
        denomination.add(20);
        denomination.add(10);
        denomination.add(5);
        denomination.add(1);

    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
           solve(n);
        }
    }
}