package com.github.xronys.algorithms.yandex.training.v2.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SolutionB {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for( int i = 0; i < str.length; i++) {
          list.add(Integer.parseInt(str[i]));
        }
        for(int i = 0; i < list.size(); i++) {
            int tempRight = 0;
            int tempLeft = 0;
            if(list.get(i) == 1) {
                for(int j = i; j < list.size(); j++) {
                    tempRight++;
                    if(list.get(j)== 2) {
                        break;
                    }
                    if(j == (list.size() - 1)) {
                        tempRight = Integer.MAX_VALUE;
                    }
                }
                for(int j = i; j >= 0; j--) {
                    tempLeft++;
                    if(list.get(j) == 2) {
                        break;
                    }
                    if(j == 0) {
                        tempLeft = Integer.MAX_VALUE;
                    }
                }
            }
            int temp = tempLeft < tempRight ? tempLeft : tempRight;
            if(temp > result) {
                result = temp - 1;
            }
        }


        System.out.println(result);

    }
}
