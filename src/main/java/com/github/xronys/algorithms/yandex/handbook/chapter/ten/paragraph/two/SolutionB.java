package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.two;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionB {
    public static void solve( List<Integer> souvenirs, int amountOfMoney ) {
        int result = 0;
        while (amountOfMoney > 0 && souvenirs.size() > 0) {
            int souvenir = souvenirs.get(0);
            if (amountOfMoney >= souvenir) {
                result++;
                amountOfMoney -= souvenir;
            } else {
                break;
            }
            souvenirs.remove(souvenirs.get(0));
        }
        System.out.println(result);
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str[] = reader.readLine().split(" ");
            int souvenirsCount = Integer.parseInt(str[0]);
            int amountOfMoney = Integer.parseInt(str[1]);
            List<Integer> souvenirs = new ArrayList<>();
            for (int i = 0; i < souvenirsCount; i++) {
                int temp = Integer.parseInt(reader.readLine());
                souvenirs.add(temp);
            }
            Collections.sort(souvenirs);
            solve(souvenirs, amountOfMoney);
        }
    }
}
