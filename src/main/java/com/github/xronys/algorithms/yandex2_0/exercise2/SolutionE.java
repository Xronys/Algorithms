package com.github.xronys.algorithms.yandex2_0.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionE {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < str.length; i++) {
            list.add(Integer.parseInt(str[i]));
        }

        Collections.sort(list);

        for(int i = 0; i < list.size()-1; i++) {
            result += list.get(i);
        }

        System.out.println(result);

    }
}
