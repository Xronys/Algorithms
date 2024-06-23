package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionA {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int q = Integer.parseInt(reader.readLine());
            for (int i = 0; i < q; i++) {
                String[] input = reader.readLine().split(" ");
                if(Integer.parseInt(input[0]) == 1) {
                    deque.addLast(Integer.parseInt(input[1]));
                    System.out.println(deque.peekFirst());
                }
                else if(Integer.parseInt(input[0]) == 2) {
                    deque.removeFirst();
                    if(deque.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(deque.peekFirst());
                    }
                }
            }
        }
    }
}
