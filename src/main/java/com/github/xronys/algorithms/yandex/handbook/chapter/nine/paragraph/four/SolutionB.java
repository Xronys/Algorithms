package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SolutionB {
    public static void main (String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        int n = Integer.parseInt(reader.readLine());
            List<Integer> list = new ArrayList<Integer>();
        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(input[i]);
            int count = 0;
            list.add(temp);
            for(int j = list.size() - 2; j>=0; j--) {
                if(temp > list.get(j)) {
                    count++;
                }
                else {
                    break;
                }
            }
            if(i == n - 1) {
                System.out.print(count);
            }
            else {
                System.out.print(count + " ");
            }
        }
        }
    }
}
