package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SolutionA {

    public static int binarySearch (int numbersArray[], int q, int bottom, int top) {
        int middle = (top + bottom) / 2;
        if(numbersArray[middle] == q)
            return middle;
        else if(bottom >= top)
            return - 1;
        else if(numbersArray[middle] > q) {
        return binarySearch(numbersArray,q,bottom,middle - 1);
        }
        else {
           return binarySearch(numbersArray,q,middle + 1, top);
        }

    }



    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int k = Integer.parseInt(reader.readLine());
            String numbers[] = reader.readLine().split(" ");
            int q = Integer.parseInt(reader.readLine());
            int numbersArray[] = new int[k];
            for(int i = 0; i < numbers.length; i++) {
                numbersArray[i] = Integer.parseInt(numbers[i]);
            }
            System.out.println(binarySearch(numbersArray, q,0, numbersArray.length - 1));
        }
    }
}