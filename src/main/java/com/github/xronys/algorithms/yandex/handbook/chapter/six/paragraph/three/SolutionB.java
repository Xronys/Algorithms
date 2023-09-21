package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.three;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SolutionB {
    public static long solve( List<Integer> billboards, List<Advertising> advertising, int w) {
        Collections.sort(advertising);
        long result = 0;

        while(!billboards.isEmpty() && !advertising.isEmpty()) {
            int billboard = billboards.get(0);
            Advertising adv = advertising.get(0);
            if(billboard >= adv.placementTime) {
                billboard = billboard - adv.placementTime;
                result += adv.placementTime * adv.price;
                advertising.remove(0);
            }
            else {
                result += billboard * adv.price;
                adv.placementTime -= billboard;
                billboard = 0;
            }
                if (billboard == 0) {
                    billboards.remove(0);
                } else {
                    billboards.set(0, billboard);
                }
        }

        return result;
    }



    public static class Advertising implements Comparable<Advertising> {
        int price;
        int placementTime;

        public Advertising( int price, int placementTime ) {
            this.price = price;
            this.placementTime = placementTime;
        }

        // descending order
        @Override
        public int compareTo( Advertising o ) {
            return  o.price - this.price;
        }
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str1[] = reader.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int k = Integer.parseInt(str1[1]);
            int w = Integer.parseInt(str1[2]);
            List<Integer> billboards = new ArrayList<>();
            List<Advertising> advertising = new ArrayList<>();
            for(int i = 0; i < n; i++) {
            billboards.add(w);
            }
            for(int i = 0; i < k; i++) {
                String str[] = reader.readLine().split(" ");
                int price = Integer.parseInt(str[0]);
                int placementTime = Integer.parseInt(str[1]);
                if (placementTime > w) {
                    placementTime = w;
                }
                advertising.add(new Advertising(price,placementTime));
            }
            writer.write(String.valueOf(solve(billboards, advertising, w)));
        }
    }
}
