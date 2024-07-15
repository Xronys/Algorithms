package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class SolutionA {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            String[] temp = reader.readLine().split(" ");
            String firstElement = temp[0];
            if (firstElement.equals("1")) {
                    list.add(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
            }
            else if (firstElement.equals("2")) {
                System.out.println(list.get(Integer.parseInt(temp[1])));
            }
            else if (firstElement.equals("3")) {
                list.remove(Integer.parseInt(temp[1]));
            }
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}

