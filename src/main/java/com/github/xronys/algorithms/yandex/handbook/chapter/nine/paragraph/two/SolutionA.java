package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SolutionA {
   public static void main (String[] args) throws IOException {
       try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
           Set<Integer> set = new HashSet<>();
           int q = Integer.parseInt(reader.readLine());
           for (int i = 0; i < q; i++) {
               String[] temp = reader.readLine().split(" ");
               if (Integer.parseInt(temp[0]) == 1) {
                   set.add(Integer.parseInt(temp[1]));
               }
               else {
                   if (set.contains(Integer.parseInt(temp[1]))) {
                       System.out.println(1);
                   }
                   else {
                       System.out.println(0);
                   }
               }
           }
       }
   }


}
