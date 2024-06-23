package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SolutionA {
    public static void main (String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Stack<Integer> stack = new Stack<>();
            int q = Integer.parseInt(reader.readLine());
            for (int i = 0; i < q; i++) {
                String[] line = reader.readLine().split(" ");
                if (Integer.parseInt(line[0]) == 1) {
                    stack.push(Integer.parseInt(line[1]));
                        System.out.println(stack.peek());
                }
                else if (Integer.parseInt(line[0]) == 2) {
                    stack.pop();
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(stack.peek());
                    }
                }
            }
        }
    }
}
