package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.five;

import java.io.*;

public class SolutionA {
    public static void selectionSort(int[] numbersArray) {
        for(int i = 0; i < numbersArray.length; i++) {
            int min = numbersArray[i];
            int index = i;
            for(int j = i + 1; j < numbersArray.length; j++) {
                if(numbersArray[j] < min) {
                    min = numbersArray[j];
                    index = j;
                }
            }
            if (index != i) {
                int temp = numbersArray[i];
                numbersArray[i] = min;
                numbersArray[index] = temp;
            }
        }
    }

    public static String showArray(int[] array) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
        result.append(array[i] + " ");
        }
        return result.toString();
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
            selectionSort(numbersArray);
            writer.write(showArray(numbersArray));
        }
    }
}
