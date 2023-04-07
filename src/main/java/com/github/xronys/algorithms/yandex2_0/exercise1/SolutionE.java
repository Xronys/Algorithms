package com.github.xronys.algorithms.yandex2_0.exercise1;

/*
На координатной плоскости расположены равнобедренный прямоугольный треугольник ABC с длиной катета d и точка X.
Катеты треугольника лежат на осях координат, а вершины расположены в точках: A (0,0), B (d,0), C (0,d).
Напишите программу, которая определяет взаимное расположение точки X и треугольника. Если точка X расположена
внутри или на сторонах треугольника, выведите 0. Если же точка находится вне треугольника, выведите номер ближайшей
 к ней вершины.
*/

/*Формат ввода
Сначала вводится натуральное число d (не превосходящее 1000), а затем координаты точки X – два целых числа из
диапазона от –1000 до 1000.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class SolutionE {
    int xA = 0;
    int yA = 0;
    int xB;
    int yB = 0;
    int xC = 0;
    int yC;
    int result = 1;
    int d;

    public SolutionE( int d) {
        this.xB = d;
        this.yC = d;
        this.d = d;
    }

    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int d = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        int xX = Integer.parseInt(str[0]);
        int yX = Integer.parseInt(str[1]);

        SolutionE solutionE = new SolutionE(d);

        solutionE.solve(xX,yX);
        System.out.println(solutionE.result);

    }

    public int solve(int xX, int yX){
        if( (xX >= 0 && yX >= 0 && xX + yX <= d)  )
            result = 0;
        else {
            Map<Integer,Integer> map = new HashMap<>();
           int a = xX * xX + yX * yX;
           int b =(xX - d) * (xX - d) + yX * yX;
           int c = xX * xX + (yX - d) * (yX - d);
            int min = a;
            result = 1;
            if(min > b) {
                result = 2;
                min = b;
            }
            if(min > c)
                result = 3;
        }
        return result;
    }

}
