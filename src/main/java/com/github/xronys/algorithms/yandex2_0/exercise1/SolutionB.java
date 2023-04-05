package com.github.xronys.algorithms.yandex2_0.exercise1;

/*Витя работает недалеко от одной из станций кольцевой линии Московского метро, а живет рядом с другой станцией той же
линии. Требуется выяснить, мимо какого наименьшего количества промежуточных станций необходимо проехать Вите по кольцу,
чтобы добраться с работы домой.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionB {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int i = Integer.parseInt(str[1]);
        int j = Integer.parseInt(str[2]);
        int result = 0;
        int forward = 0;
        int backward = 0;

        forward = Math.abs(i - j) - 1;
        if(i < j)
        backward = Math.abs((i) + (n - j)) - 1;
        else
            backward = Math.abs((j) + (n - i)) - 1;

        result = forward < backward ? forward : backward;

        System.out.println(result);
    }

}

