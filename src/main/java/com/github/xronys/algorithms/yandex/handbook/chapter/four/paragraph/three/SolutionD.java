package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.three;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionD {
    public static long solve( List<Integer> numbersList) {
        Collections.sort(numbersList);
        long result;
        int head = numbersList.get(numbersList.size() - 1);
        if (head <= 0 || numbersList.size() == 4) {
            result = (long) numbersList.get(0)
                    * numbersList.get(1) * numbersList.get(2) * numbersList.get(3); }
        else {
            int tail = numbersList.get(0);
            int tail2 = numbersList.get(1);
            int tail3 = numbersList.get(2);
            int tail4 = numbersList.get(3);
            int head2 =  numbersList.get(numbersList.size() - 2);
            int head3 =  numbersList.get(numbersList.size() - 3);
            int head4 =  numbersList.get(numbersList.size() - 4);
            List<Long> resultList = new ArrayList<>();
           resultList.add((long) tail * tail2 * tail3 * tail4);
           resultList.add((long) tail * tail2 * head * head2);
           resultList.add((long) head * head2 * head3 * head4);
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
