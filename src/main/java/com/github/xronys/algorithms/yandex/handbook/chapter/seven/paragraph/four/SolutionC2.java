package com.github.xronys.algorithms.yandex.handbook.chapter.seven.paragraph.four;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionC2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); // Количество точек
            int k = scanner.nextInt(); // Количество отрезков
            int[] points = new int[n];

            for (int i = 0; i < n; i++) {
                points[i] = scanner.nextInt();
            }

            // Сортируем массив точек
            Arrays.sort(points);

            int minSegmentLength = 0;

            // Вычисляем длину отрезков
            for (int i = 1; i < n; i++) {
                minSegmentLength += (points[i] - points[i - 1]);
            }

            // Вычитаем k - 1 из длины отрезков, чтобы учесть k - 1 нулевой длины
            minSegmentLength -= (k - 1);

            System.out.println(minSegmentLength);
        }
}
