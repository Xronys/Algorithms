package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.four;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionA {
    public static void solve(List<Segment> segments) {
        Collections.sort(segments);
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        while(!segments.isEmpty()) {
            int r = segments.get(0).r;
            result.add(r);
            stringBuilder.append(r + " ");
            segments.removeIf(segment -> segment.l <= r);
        }
        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++) {
            if(i + 1 == result.size())
                System.out.print(result.get(i));
            else
                System.out.print(result.get(i) + " ");
        }

    }

    public static class Segment implements Comparable<Segment> {
        int l;
        int r;

        public Segment( int l, int r ) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo( Segment o ) {
            return this.r - o.r;
        }
    }
    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            List<Segment> segments = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String str[] = reader.readLine().split(" ");
                segments.add(new Segment(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
            }
           solve(segments);
        }
    }
}
