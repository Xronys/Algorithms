package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.one;

import java.io.*;



public class SolutionB {
    public static int binarySearch( int numbersArray[], int q, int bottom, int top ) {
        int middle = (top + bottom) / 2;
        if (numbersArray[middle] == q)
            return middle;
        else if (bottom >= top)
            return -1;
        else if (numbersArray[middle] > q) {
            return binarySearch(numbersArray, q, bottom, middle - 1);
        } else {
            return binarySearch(numbersArray, q, middle + 1, top);
        }

    }


    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int k = Integer.parseInt(reader.readLine());
            String numbers[] = reader.readLine().split(" ");
            int m = Integer.parseInt(reader.readLine());
            int numbersArray[] = new int[k];
            int numbersForSearch[] = new int[m];
            String numbersForSearchStr[] = reader.readLine().split(" ");
            for (int i = 0; i < numbers.length; i++) {
                numbersArray[i] = Integer.parseInt(numbers[i]);
            }
            for (int i = 0; i < m; i++) {
                numbersForSearch[i] = Integer.parseInt(numbersForSearchStr[i]);
            }
            for (int i = 0; i < numbersForSearch.length; i++) {
                int q = numbersForSearch[i];
                writer.write(String.valueOf(binarySearch(numbersArray, q, 0, numbersArray.length - 1)) + "\n");
            }

        }
    }
}