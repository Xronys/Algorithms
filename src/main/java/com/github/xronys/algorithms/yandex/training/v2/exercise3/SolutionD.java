package com.github.xronys.algorithms.yandex.training.v2.exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionD {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(reader.readLine());
        Set<Integer> yes = new TreeSet<>();
        Set<Integer> no = new TreeSet<>();


        while(true) {
            String[] temp1 = reader.readLine().split(" ");
            String temp2 = reader.readLine();
            if (temp1[0].equalsIgnoreCase("help") || temp2.equalsIgnoreCase("help")) {
                break;
            }
            if(yes.isEmpty()) {
                for(int i = 1; i <= n; i++) {
                    yes.add(i);

                }
            }
            if(temp2.equalsIgnoreCase("no")) {
                for(int i = 0; i < temp1.length; i++) {
                    no.add(Integer.parseInt(temp1[i]));
                }
            }
            else if(temp2.equalsIgnoreCase("yes")) {
                    Set<Integer> r = new TreeSet<>();
                    for(int i = 0; i < temp1.length; i++) {
                        int temp = Integer.parseInt(temp1[i]);
                        if(yes.contains(temp))
                        r.add(temp);
                    }
                    yes = r;
            }
        }


        for (Integer temp: yes
             ) {
            if(!no.contains(temp))
            result.append(temp + " ");
        }


        result.trimToSize();
        System.out.println(result);

    }
}
