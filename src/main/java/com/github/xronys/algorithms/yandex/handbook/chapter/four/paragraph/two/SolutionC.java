package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionC {
    public static String solve (String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < charArray1.length; i++) {
            result.append(charArray1[i]);
            result.append(charArray2[i]);
        }
    return result.toString();
    }

    public static void main( String[] args ) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            System.out.println(solve(str1,str2));
        }
    }
}
