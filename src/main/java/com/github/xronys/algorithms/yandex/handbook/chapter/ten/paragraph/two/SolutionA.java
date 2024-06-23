package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.two;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SolutionA {
    public static void solve( List<String> routesList, int stops, BufferedWriter writer ) throws IOException {
        int stopsArray[][] = new int[stops][stops];
        int routesArray[][] = new int[stops][stops];
       /* int countm = 0;
        int count1 = 0;
        int count2 = 0;*/
        for (int i = 0; i < routesList.size(); i++) {
           /* countm++;*/
            String route[] = routesList.get(i).split(" ");
            if (route.length > 2) {
                int prevStop = Integer.parseInt(route[1]);
                for (int j = 2; j <= route.length; j++) {
                   /* count1++;*/
                    //filling routesArray
                    for (int k = 1; k < route.length; k++) {
                       /* count2++;*/
                        if(prevStop == Integer.parseInt(route[k]))
                            continue;
                        routesArray[prevStop - 1][Integer.parseInt(route[k]) - 1] = 1;
                    }
                    //filling stopsArray
                    if(j == route.length)
                        continue;
                    int currentStop = Integer.parseInt(route[j]);
                    if (currentStop == prevStop)
                        continue;
                    stopsArray[prevStop - 1][currentStop - 1] = 1;
                    stopsArray[currentStop - 1][prevStop - 1] = 1;
                    prevStop = currentStop;
                }
            }
        }
       /* System.out.println(countm);
        System.out.println(count1);
        System.out.println(count2);*/
        showArray(stopsArray, writer);
        showArray(routesArray, writer);

    }

    public static void showArray(int[][] array, BufferedWriter writer ) throws IOException{
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j + 1 == array[i].length)
            writer.write((array[i][j]) + "\n");
                /*System.out.println(array[i][j]);*/
                else
                    writer.write((array[i][j] + " "));
            }
        }
    }

    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str[] = reader.readLine().split(" ");
            int stops = Integer.parseInt(str[0]);
            int routes = Integer.parseInt(str[1]);

            List<String> routesList = new ArrayList<>();
            for (int i = 0; i < routes; i++) {
                routesList.add(reader.readLine());
            }
            solve(routesList, stops, writer);
        }
    }
}
