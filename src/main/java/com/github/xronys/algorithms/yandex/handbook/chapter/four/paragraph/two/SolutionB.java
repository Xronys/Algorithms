package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolutionB {
    public static ArrayList <Integer> solve(int polynomialASize, String[] polynomialA, int polynomialBSize, String[] polynomialB) {
    ArrayList<Integer> result = new ArrayList<>();
    if(polynomialASize >= polynomialBSize) {
    for(int i = 0; i <= polynomialASize; i++) {
        result.add(Integer.parseInt(polynomialA[i]));
    }
    int index = 0;
    for(int i =  polynomialASize - polynomialBSize; i <= polynomialASize; i++) {
        int sum = result.get(i) + Integer.parseInt(polynomialB[index]);
        index++;
        result.set(i, sum);
    }
    }
    else {
        for(int i = 0; i <= polynomialBSize; i++) {
            result.add(Integer.parseInt(polynomialB[i]));
        }
        int index = 0;
        for(int i =  polynomialBSize - polynomialASize; i <= polynomialBSize; i++) {
            int sum = result.get(i) + Integer.parseInt(polynomialA[index]);
            index++;
            result.set(i, sum);
        }
    }
        return result;
    }
    public static void main ( String[] args) throws Exception{
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        int polynomialASize = Integer.parseInt(reader.readLine());
        String[] polynomialA = reader.readLine().split(" ");
        int polynomialBSize = Integer.parseInt(reader.readLine());
        String[] polynomialB = reader.readLine().split(" ");
        ArrayList<Integer> result = solve(polynomialASize, polynomialA, polynomialBSize,polynomialB);
        System.out.println(result.size() - 1);
        for (int i = 0; i < result.size(); i++) {
            if(i == result.size() - 1) {
                System.out.println(result.get(i));
            } else {
                System.out.print(result.get(i) + " ");
            }
        }
    }
    }



}
