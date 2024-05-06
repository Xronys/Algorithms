package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.six;

import java.io.*;

public class SolutionA {
    public static int[] quickSort(int[] numbersArray, int lowerBound,int upperBound ) {
        if(upperBound == lowerBound || numbersArray.length < 2) {
            return numbersArray;
        }
        int prevLoverBound = lowerBound;
        int pivot = numbersArray[lowerBound];
        for(int i = lowerBound + 1; i < upperBound; i++) {
            int currentNumber = numbersArray[i];
            if(currentNumber < pivot) {
               lowerBound++;
                int temp = numbersArray[lowerBound];
                numbersArray[lowerBound] = currentNumber;
                numbersArray[i] = temp;
            }
        }
        int temp = numbersArray[lowerBound];
        numbersArray[lowerBound] = pivot;
        numbersArray[prevLoverBound] = temp;
        quickSort(numbersArray,prevLoverBound, lowerBound);
        quickSort(numbersArray,lowerBound + 1, upperBound);
        return numbersArray;
    }

    public static int[] lomutoPartition(int[] numbersArray) {
       int separator = numbersArray[0];
       int separatorIndex = 0;
       for(int i = 1; i < numbersArray.length; i++) {
           int currentNumber = numbersArray[i];
           if(currentNumber <= separator) {
               separatorIndex++;
               int temp = numbersArray[separatorIndex];
               numbersArray[separatorIndex] = currentNumber;
               numbersArray[i] = temp;
           }
       }
       int temp = numbersArray[separatorIndex];
       numbersArray[separatorIndex] = separator;
       numbersArray[0] = temp;
        return numbersArray;
    }

    public static String showArray(int[] array) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            result.append(array[i] + " ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            String[] numbers = reader.readLine().split(" ");
            int[] numbersArray = new int[n];
            for(int i = 0; i < n; i++) {
                numbersArray[i] = Integer.parseInt(numbers[i]);
            }
           quickSort(numbersArray,0, numbersArray.length);
            writer.write(showArray(numbersArray));
        }
    }
}
