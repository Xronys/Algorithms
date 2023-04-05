package com.github.xronys.algorithms.yandex2_0.exercise1;

/*Лена руководит разработкой тестирующей системы, в которой реализованы интерактивные задачи.
        До заверщения очередной стадии проекта осталось написать модуль, определяющий итоговый вердикт системы для
        интерактивной задачи. Итоговый вердикт определяется из кода завершения задачи, вердикта интерактора и вердикта
        чекера по следующим правилам:
        Вердикт чекера и вердикт интерактора — это целые числа от 0 до 7 включительно.
        Код завершения задачи — это целое число от -128 до 127 включительно.
        Если интерактор выдал вердикт 0, итоговый вердикт равен 3 в случае, если программа завершилась с ненулевым
        кодом, и вердикту чекера в противном случае.
        Если интерактор выдал вердикт 1, итоговый вердикт равен вердикту чекера.
        Если интерактор выдал вердикт 4, итоговый вердикт равен 3 в случае, если программа завершилась с ненулевым
        кодом, и 4 в противном случае.
        Если интерактор выдал вердикт 6, итоговый вердикт равен 0.
        Если интерактор выдал вердикт 7, итоговый вердикт равен 1.
        В остальных случаях итоговый вердикт равен вердикту интерактора.
        Ваша задача — реализовать этот модуль.*/

/*Входной файл состоит из трёх строк. В первой задано целое число r(−1 2 8≤r≤1 2 7) —
код завершения задачи, во второй — целое число i(0≤i≤7) — вердикт интерактора, в третьей — целое число c(0≤c≤7)
— вердикт чекера.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionA {


    public static void main( String[] args ) throws Exception{

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int code = Integer.parseInt(reader.readLine());
        int interactor = Integer.parseInt(reader.readLine());
        int checker = Integer.parseInt(reader.readLine());
        int result = 0;
        switch(interactor) {
            case 0 :
                if(code != 0)
                    result = 3;
                else
                    result = checker;
            break;
            case 1 :
                result = checker;
                break;
            case 2 :
                result = 2;
                break;
            case 3 :
                result = 3;
                break;
            case 4 :
                if(code != 0)
                result = 3;
                else
                    result = 4;
                break;
            case 5 :
                result = 5;
                break;
            case 6 :
                result = 0;
                break;
            case 7 :
                result = 1;
                break;
        }

        System.out.println(result);

    }


}
