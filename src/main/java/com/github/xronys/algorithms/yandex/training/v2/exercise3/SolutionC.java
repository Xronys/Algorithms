package com.github.xronys.algorithms.yandex.training.v2.exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionC {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = reader.readLine().split(" ");
        Map<Integer,Integer> map = new LinkedHashMap<>();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str1.length; i++) {
            int temp = Integer.parseInt(str1[i]);
            if(!map.containsKey(temp)) {
                map.put(temp, 1);
            }
            else {
                map.put(temp, map.get(temp) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> item : map.entrySet()
        ) {
            if(item.getValue() == 1) {
                builder.append(item.getKey() + " ");
            }
        }
        builder.trimToSize();
        System.out.println(builder.toString());

    }
}
