package com.github.xronys.algorithms.yandex.training.v2.exercise1;

/*В деревне Интернетовка все дома расположены вдоль одной улицы по одну сторону от нее. По другую сторону от этой улицы
пока ничего нет, но скоро все будет – школы, магазины, кинотеатры и т.д.
        Для начала в этой деревне решили построить школу. Место для строительства школы решили выбрать так, чтобы
        суммарное расстояние, которое проезжают ученики от своих домов до школы, было минимально.
        План деревни можно представить в виде прямой, в некоторых целочисленных точках которой находятся дома учеников.
        Школу также разрешается строить только в целочисленной точке этой прямой (в том числе разрешается строить школу
         в точке, где расположен один из домов – ведь школа будет расположена с другой стороны улицы).
        Напишите программу, которая по известным координатам домов учеников поможет определить координаты места
        строительства школы.*/

/*      Формат ввода
        Сначала вводится число N — количество учеников (0 < N < 100001).
        Далее идут в строго возрастающем порядке координаты домов учеников — целые числа, не превосходящие 2 × 10^9
        по модулю.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionD {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        int result = 0;
        if(n % 2 == 1)
            result = Integer.parseInt(str[((n + 1) / 2)-1]);
        else
        {
            int first = (n / 2) - 1;
            int second = first + 1;
            result = (Integer.parseInt(str[second]) + Integer.parseInt(str[first])) / 2;
        }

        System.out.println(result);

    }

}
