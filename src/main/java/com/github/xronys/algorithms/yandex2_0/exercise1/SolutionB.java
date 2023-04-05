package com.github.xronys.algorithms.yandex2_0.exercise1;

/*Витя работает недалеко от одной из станций кольцевой линии Московского метро, а живет рядом с другой станцией той же
линии. Требуется выяснить, мимо какого наименьшего количества промежуточных станций необходимо проехать Вите по кольцу,
чтобы добраться с работы домой.*/

/*Станции пронумерованы подряд натуральными числами 1, 2, 3, …, N (1-я станция – соседняя с N-й), N не превосходит 100.
Вводятся три числа: сначала N – общее количество станций кольцевой линии, а затем i и j – номера станции,
на которой Витя садится, и станции, на которой он должен выйти. Числа i и j не совпадают. Все числа разделены
пробелом.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionB {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int i = Integer.parseInt(str[1]);
        int j = Integer.parseInt(str[2]);
        int result;
        int forward;
        int backward;

        forward = Math.abs(i - j) - 1;
        if(i < j)
        backward = Math.abs((i) + (n - j)) - 1;
        else
            backward = Math.abs((j) + (n - i)) - 1;

        result = forward < backward ? forward : backward;

        System.out.println(result);
    }

}

