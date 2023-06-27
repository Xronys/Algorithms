package com.github.xronys.algorithms.yandex.training.v2.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionD {
    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int left = -1;
        int right = -1;
        String[] str1 = reader.readLine().split(" ");
        int length = Integer.parseInt(str1[0]);
        String[] str2 = reader.readLine().split(" ");
        for (int i = 0; i < str2.length; i++) {
            int temp = Integer.parseInt(str2[i]);

            if(temp == ((length ) / 2) && length % 2 == 1) {
                left = temp;
                break;
            }
            else if( temp < length / 2 ) {
                left = temp;
                /*if(temp == length / 2)
                    break;*/
            }
            else if(temp >= length  / 2) {
                right = temp;
                break;
            }
        }

        if(left != -1) {
            result.append(left);
        }
        if(right != -1) {
            if (result.length() == 0) {
                result.append(right);
            } else {
                result.append(" " + right);
            }
        }
/*        System.out.println(left);
        System.out.println(right);*/
        System.out.println(result.toString());

    }
}
