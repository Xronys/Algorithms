package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.four;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionC {

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str1[] = reader.readLine().split(" ");
            String str2[] = reader.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int k = Integer.parseInt(str1[1]);
            int count = 0;
            List<Integer> points = new ArrayList<>();
            List<Interval> intervals = new ArrayList<>();
            List<Integer> pointsToRemove = new ArrayList<>();
            List<Integer> intervalsList = new ArrayList<>();
            //filling list of points
            for (int i = 0; i < str2.length; i++) {
                points.add(Integer.parseInt(str2[i]));
            }
            Collections.sort(points);
            //filling list of duplicated points and filling list of intervals
            int prev = points.get(0);
            for (int i = 1; i < n; i++) {
                int current = points.get(i);
                int length = current - prev;
                prev = current;
                if (length == 0) {
                    pointsToRemove.add(i - 1);
                    pointsToRemove.add(i);
                    if (i + 1 < n) {
                        prev = points.get(i + 1);
                    }
                    i++;
                    continue;
                }
                intervals.add(new Interval(i - pointsToRemove.size(), length));
            }
            intervals.remove(intervals.size() - 1);
            //removing duplicated points
            for (int i = 0; i < pointsToRemove.size(); i++) {
                points.remove(pointsToRemove.get(i) - i);
            }
            Collections.sort(intervals);
            //main method
            if (points.size() > k && points.size() > 2 && k > 1) {
                for (int i = 0; i < k - 1; i++) {
                    Interval currentInterval = intervals.get(intervals.size() - 1);
                    if (intervals.size() > 1) {
                        if (currentInterval.length == intervals.get(intervals.size() - 2).length) {
                            intervalsList.add(intervals.get(intervals.size() - 2).index - 1);
                            intervals.remove(intervals.size() - 2);
                            continue;
                        }
                    }
                    intervalsList.add(currentInterval.index - 1);
                    intervals.remove(intervals.size() - 1);
                }
                Collections.sort(intervalsList);
                prev = intervalsList.get(0);
                count += points.get(prev) - points.get(0);
                int current = prev;
                for (int i = 1; i < intervalsList.size(); i++) {
                    current = intervalsList.get(i);
                    count += points.get(current) - points.get(prev + 1);
                    prev = current;
                }
                if (current + 1 != points.size() && intervalsList.size() > 1)
                    count += points.get(points.size() - 1) - points.get(current + 1);
                else
                    count += points.get(points.size() - 1) - points.get(current);
            } else if (k == 1 || points.size() == 2) {
                count = points.get(points.size() - 1) - points.get(0);
            }

            System.out.println(count);
        }
    }

    public static class Interval implements Comparable<Interval> {
        int index;
        int length;

        public Interval( int index, int length ) {
            this.index = index;
            this.length = length;
        }


        @Override
        public int compareTo( Interval o ) {
            int length = this.length - o.length;
            if (length == 0) {
                return this.index - o.index;
            }
            return length;
        }
    }
}