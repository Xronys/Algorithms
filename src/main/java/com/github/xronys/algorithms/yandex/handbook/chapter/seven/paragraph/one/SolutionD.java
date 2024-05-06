package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.one;

import java.io.*;
import java.util.*;

public class SolutionD {

    public static int solve(List<Integer> numbers, int k) {
        if(k >= numbers.size())
        return 0;
        List<Interval> delta = delta(numbers);
        List<Integer> index = new ArrayList<>();
        if(k == 1) {
            return numbers.get(numbers.size() - 1) - numbers.get(0);
        }
        Interval interval = delta.get(index.size() - 1 - k);
        return interval.length;
    }

    public static List<Interval> delta (List<Integer> numbers) {
        List<Interval> delta = new ArrayList<>();
        int prev = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            delta.add(new Interval(current - prev,i));
            prev = current;
        }
        Collections.sort(delta);
        return delta;
    }


    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str1[] = reader.readLine().split(" ");
            String str2[] = reader.readLine().split(" ");
            int k = Integer.parseInt(str1[1]);
            List<Integer> numbers = new ArrayList<>();
            Map<Integer, Integer> duplicates = new HashMap<>();
            for(int i = 0; i < str2.length; i++) {
                int temp = Integer.parseInt(str2[i]);
                if(duplicates.containsKey(temp))
                    duplicates.put(temp,duplicates.get(temp) + 1);
                else
                duplicates.put(temp, 1);
            }
            for (var entry: duplicates.entrySet()
                 ) {
                if(entry.getValue() == 1)
                    numbers.add(entry.getKey());
            }
            Collections.sort(numbers);
            writer.write(solve(numbers, k));
        }
    }
    public static class Interval implements Comparable<Interval> {
        int length;
        int index;

        @Override
        public int compareTo( Interval o ) {
            return 0;
        }

        public Interval( int length, int index ) {
            this.length = length;
            this.index = index;
        }
    }
}
