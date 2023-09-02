package com.github.xronys.algorithms.leetcode;

import java.io.*;

public class Problem9 {
    public static boolean isPalindrome( long x ) {
        String str = String.valueOf(x);
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        return str.equals(reverseStr.toString());
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            long x = Long.parseLong(reader.readLine());
            writer.write(String.valueOf(isPalindrome(x)));
        }
    }
}
