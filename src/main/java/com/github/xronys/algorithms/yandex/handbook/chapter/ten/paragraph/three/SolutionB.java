package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.three;

import java.io.*;
import java.util.*;

public class SolutionB {
    public static int result = 1;
    public static Set<Integer> set = new HashSet<>();
    public static Queue<Integer> queue = new LinkedList<>();
    public static int count = 1;
    public static int solve( int x, int y) {
        if(x == y ) {
            return 0;
        }
            for ( int i = 0; i < 10; i++ ) {
                int plus = x + i;
                int minus = x - i;
                int multiply = x * i;
                if(plus == y || minus == y || multiply == y) {
                    break;
                }
               check(plus, minus, multiply);
                while(!queue.isEmpty()) {
                    if(count == 0) {
                        result ++;
                        count = queue.size();
                    }
                    int current = queue.poll();
                    count--;
                    for(int j = 0; j < 10; j++ ) {
                        plus = current + j;
                        minus = current - j;
                        multiply = current * j;
                        if(plus == y || minus == y || multiply == y) {
                            return result;
                        }
                        check(plus, minus, multiply);
                    }



                }
                if( i == 9) {
                    result++;
                }

        }
        return result;
    }
    public static void check(int plus, int minus, int multiply){
        if(!set.contains(plus)) {
            set.add(plus);
            queue.add(plus);
        }
        if(!set.contains(minus)) {
            set.add(minus);
            queue.add(minus);
        }
        if(!set.contains(multiply)) {
            set.add(multiply);
            queue.add(multiply);
        }
    }



    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str1[] = reader.readLine().split(" ");
            int x = Integer.parseInt(str1[0]);
            int y = Integer.parseInt(str1[1]);
            writer.write(String.valueOf(solve(x,y)));
        }
    }
}
