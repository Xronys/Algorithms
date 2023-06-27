package com.github.xronys.algorithms.yandex.training.v2.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionA {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int temp;
        int max = Integer.MIN_VALUE;
        while( (temp = Integer.parseInt(reader.readLine())) != 0) {
            if(temp > max) {
                max = temp;
                result = 1;
            }
            else if(temp == max) {
                result ++;
            }
        }

        System.out.println(result);

    }
}
