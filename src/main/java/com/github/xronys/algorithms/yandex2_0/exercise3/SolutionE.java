package com.github.xronys.algorithms.yandex2_0.exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionE {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        Set<Character>[] setM = new HashSet[m];
        for(int i = 0; i < m; i++) {
            setM[i] = new HashSet<>();
            char[] temp = reader.readLine().toCharArray();
            for(int j = 0; j < temp.length; j++) {
                setM[i].add(temp[j]);
            }
        }
        int n = Integer.parseInt(reader.readLine());
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            String str = reader.readLine();
            char[] temp = str.toCharArray();
            int result = 0;
            for(int j = 0; j < temp.length; j++) {
                hashSet.add(temp[j]);
            }
            for(int j = 0; j < m; j++) {
                if(hashSet.containsAll(setM[j]))
                    result++;
            }
            strings.add(str);
            integers.add(result);
        }

        Integer max = Collections.max(integers);
        for (int i = 0; i < integers.size(); i++
             ) {
            if(integers.get(i) == max)
                System.out.println(strings.get(i));
        }



    }
}
