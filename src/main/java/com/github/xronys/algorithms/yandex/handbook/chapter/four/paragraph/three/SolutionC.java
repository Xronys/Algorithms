package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.three;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionC {
    public static long solve( List<Integer> numbersList) {
        Collections.sort(numbersList);
        long result;
        int head = numbersList.get(numbersList.size() - 1);
        if (head <= 0 || numbersList.size() == 3) {
         result = (long) head *  numbersList.get(numbersList.size() - 2)
                * numbersList.get(numbersList.size() - 3); }
        else {
            int tail = numbersList.get(0);
            int tail2 = numbersList.get(1);
            int head2 =  numbersList.get(numbersList.size() - 2);
            int head3 =  numbersList.get(numbersList.size() - 3);
            List<Integer> count = new ArrayList<>();
            count.add(tail);
            count.add(tail2);
            count.add(head2);
            count.add(head3);
            List<Long> resultList = new ArrayList<>();
            for(int i = 0; i < 3; i++) {
                for(int j = i + 1; j < 4; j++) {
                    long temp = (long) head * count.get(i) * count.get(j);
                    resultList.add(temp);
                }
            }
            Collections.sort(resultList);
            result = resultList.get(resultList.size() - 1);
        }
        return result;
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int a = Integer.parseInt(reader.readLine());
            String[] numbers = reader.readLine().strip().split(" ");
            List<Integer> numbersList = new ArrayList<>(a);
            for(int i = 0; i < numbers.length; i++) {
                numbersList.add(Integer.parseInt(numbers[i]));
            }

            writer.write(String.valueOf(solve(numbersList)));

        }

    }
}
