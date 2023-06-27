package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionD {
    public static void solve (int[][] matrix1, int[][] matrix2, int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int temp = matrix1[i][j] + matrix2[i][j];
                if(j < m - 1)
                System.out.print(temp + " ");
                else
                    System.out.print(temp);
            }
            if(i < n - 1)
                System.out.println();
        }
    }

    public static void main( String[] args ) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str1 = reader.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int m = Integer.parseInt(str1[1]);
            int[][] matrix1 = new int[n][m];
            int[][] matrix2 = new int[n][m];
            for(int i = 0; i < n; i++) {
                String[] str = reader.readLine().split(" ");
                for(int j = 0; j < m; j++) {
                    matrix1[i][j] = Integer.parseInt(str[j]);
                }
            }
            for(int i = 0; i < n; i++) {
                String[] str = reader.readLine().split(" ");
                for(int j = 0; j < m; j++) {
                    matrix2[i][j] = Integer.parseInt(str[j]);
                }
            }
            solve(matrix1, matrix2, n, m);
        }
    }
}
