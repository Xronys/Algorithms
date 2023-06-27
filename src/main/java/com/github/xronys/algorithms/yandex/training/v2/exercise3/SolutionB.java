package com.github.xronys.algorithms.yandex.training.v2.exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SolutionB {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = reader.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < str1.length; i++) {
            int temp = Integer.parseInt(str1[i]);
            if(!set.contains(temp)) {
                set.add(temp);
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }



    }
}
