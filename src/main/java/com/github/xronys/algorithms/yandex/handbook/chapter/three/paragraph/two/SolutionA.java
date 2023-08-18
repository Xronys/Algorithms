package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.two;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionA {
    public static long solve(List<Segment> segments) {
       int result = 0;
       while(segments.size() > 0) {
           int min = segments.get(0).r;
           for (int j = 0; j < segments.size(); j++) {
               if(min >= segments.get(j).l) {
                   segments.remove(j);
                   j--;
               }
           }
           result++;
       }
        return result;
    }

    static class Segment implements Comparable<Segment> {
        int l;
        int r;

        public Segment( int l, int r ) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo( Segment o ) {
            return r - o.r;
        }
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            List<Segment> segments = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String[] str = reader.readLine().split(" ");
               segments.add(new Segment(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
            }
            Collections.sort(segments);
            writer.write(String.valueOf(solve(segments)));
        }
    }
}
