package com.github.xronys.algorithms.yandex.handbook.chapter.six.paragraph.two;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class SolutionA {
    public static void solve( List<Spice> spices, int backpackVolume ) {
        double result = 0.0;
        while (backpackVolume > 0 && spices.size() > 0) {
            Spice spice = spices.get(spices.size() - 1);
            if (backpackVolume >= spice.amount) {
                result += spice.totalPrice;
                backpackVolume -= spice.amount;
            } else {
                double onePieces = spice.totalPrice / spice.amount;
                result += backpackVolume * onePieces;
                backpackVolume = 0;
            }
            spices.remove(spices.size() - 1);
        }
        System.out.println(String.format(String.format(Locale.ENGLISH, "%.3f", result)));
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str[] = reader.readLine().split(" ");
            int spicesCount = Integer.parseInt(str[0]);
            int backpackVolume = Integer.parseInt(str[1]);
            List<Spice> spices = new ArrayList<>();
            for (int i = 0; i < spicesCount; i++) {
                String[] temp = reader.readLine().split(" ");
                if (Double.parseDouble(temp[0]) <= 0 || Integer.parseInt(temp[1]) <= 0) {
                    continue;
                }
                spices.add(new Spice(Double.parseDouble(temp[0]), Integer.parseInt(temp[1])));
            }
            Collections.sort(spices);
            solve(spices, backpackVolume);
        }
    }

    static class Spice implements Comparable<Spice> {
        double totalPrice;
        int amount;

        public Spice( double totalPrice, int amount ) {
            this.totalPrice = totalPrice;
            this.amount = amount;
        }

        @Override
        public int compareTo( Spice o ) {
            return Double.compare(totalPrice / amount, o.totalPrice / o.amount);
        }
    }
}
