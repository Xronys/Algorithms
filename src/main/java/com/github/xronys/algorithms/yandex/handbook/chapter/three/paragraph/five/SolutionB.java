package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.five;

import java.io.*;

public class SolutionB {
    public static int[] mergeSort( int[] numbersArray) {
        if(numbersArray.length < 2)
            return numbersArray;
        int[] firstHalf = new int[numbersArray.length/2];
        int[] secondHalf;
        if(numbersArray.length % 2 == 0)
            secondHalf = new int[numbersArray.length/2];
        else
            secondHalf = new int[(numbersArray.length/2) + 1];
        for(int i = 0; i < numbersArray.length; i++) {
            if(i < numbersArray.length/2) {
                firstHalf[i] = numbersArray[i];
            }
            else {
                secondHalf[i - firstHalf.length] = numbersArray[i];
            }
        }
        int[] sortedFirstHalf = mergeSort(firstHalf);
        int[] sortedSecondHalf = mergeSort(secondHalf);
        int[] sortedArray = merge(sortedFirstHalf, sortedSecondHalf);
        return sortedArray;
    }

    public static int[] merge(int[] firstArray, int[] secondArray) {
        int index1 = 0;
        int index2 = 0;
        int[] sortedArray = new int[firstArray.length + secondArray.length];
        while(index1 < firstArray.length && index2 < secondArray.length) {
            if(firstArray[index1] < secondArray[index2]) {
                sortedArray[index1 + index2] = firstArray[index1];
                index1++;
            }
            else {
                sortedArray[index1 + index2] = secondArray[index2];
                index2++;
            }
        }
        if (index1 < firstArray.length) {
            while(index1 < firstArray.length) {
                sortedArray[index1 + index2] = firstArray[index1];
                index1++;
            }
        }
        else
        {
            while(index2 < secondArray.length) {
                sortedArray[index1 + index2] = secondArray[index2];
                index2++;
            }
        }
        return sortedArray;
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
            int[] resultArray = {};
            for(int j = 0; j < n; j++) {
                int length = Integer.parseInt(reader.readLine());
                String[] numbers = reader.readLine().split(" ");
                int[] numbersArray = new int[length];
                for(int i = 0; i < length; i++) {
                    numbersArray[i] = Integer.parseInt(numbers[i]);
                }
               int[] sortedArray = mergeSort(numbersArray);
                resultArray = merge(resultArray, sortedArray);
            }
            writer.write(showArray(resultArray));
        }
    }
}