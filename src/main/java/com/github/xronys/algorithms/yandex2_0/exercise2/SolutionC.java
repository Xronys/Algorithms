package com.github.xronys.algorithms.yandex2_0.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionC {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        char[] chars = reader.readLine().toCharArray();
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[chars.length - 1 - i])
                    result++;
            }

        System.out.println(result);

    }
}
