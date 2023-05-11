package com.github.xronys.algorithms.yandex2_0.exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SolutionA {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String[] str1 = reader.readLine().split(" ");
        String[] str2 = reader.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < str1.length; i++) {
            set.add(Integer.parseInt(str1[i]));
        }

        for(int i = 0; i < str2.length; i++) {
            if(set.contains(Integer.parseInt(str2[i])))
                result++;
        }



        System.out.println(result);

    }
}
