package com.github.xronys.algorithms.yandex.handbook.chapter.nine.paragraph.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionB {
public static class Pair implements Comparable<Pair> {
    @Override
    public int compareTo(Pair o) {
        if(this.pairDifference - o.pairDifference > 0) {
return 1;
        }
        else if(this.pairDifference - o.pairDifference < 0) {
return -1;
        }
        else {
            if(this.indexL - o.indexL > 0) {
                return 1;
            }
            else if(this.indexL - o.indexL < 0) {
                return -1;
            }
            else {
                if(this.indexR - o.indexR > 0) {
                    return 1;
                }
                else if(this.indexR - o.indexR < 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }
    private int indexL;
    private int indexR;
    private int pairDifference;
    public Pair(int indexL, int indexR, int pariDifference) {
        this.indexL = indexL;
        this.indexR = indexR;
        this.pairDifference = pariDifference;
    }

    @Override
    public String toString() {
        return indexL + " " + indexR;
    }
}

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            String[] line = reader.readLine().split(" ");
            int[] numbers = new int[n];
            ArrayList<Pair> pairs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(line[i]);
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    Pair temp = new Pair(i + 1,j + 1,numbers[i] - numbers[j]);
                    pairs.add(temp);
                }
            }
            Collections.sort(pairs);
            System.out.println(pairs.get(0));
            System.out.println(pairs.get(pairs.size() - 1));
        }

    }

}
