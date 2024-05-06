package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.three;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionA {
    public static long solve(List<Long> clicks, List<Long> price) {
        Collections.sort(clicks);
        Collections.sort(price);
        long result = 0;
        for(int i = 0; i < clicks.size(); i++) {
            result += clicks.get(i) * price.get(i);
        }
        return result;
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            String[] clicksArray = reader.readLine().split(" ");
            String[] priceArray = reader.readLine().split(" ");
            List<Long> clicks = new ArrayList<>();
            List<Long> price = new ArrayList<>();
            for(int i = 0; i < clicksArray.length; i++) {
                clicks.add(Long.parseLong(clicksArray[i]));
            }
            for(int i = 0; i < priceArray.length; i++) {
                price.add(Long.parseLong(priceArray[i]));
            }
            writer.write(String.valueOf(solve(clicks, price)));
        }
    }
}
