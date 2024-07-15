package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.two;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionB {
    public static int direction = 0;
    public static int solve(char[][] room, int r, int c, char[] movements) {
    int result = 0;
    boolean[][] visited = new boolean[room.length][room[0].length];
        for (int i = 0; i < movements.length; i++) {
            if(i == 0 ) {
                if(room[r][c] == '.') {
                    visited[r][c] = true;
                    result++;
                }
                else {
                    return result;
                }

            }
            if(movements[i] == 'M') {
                switch(direction) {
                    case 0:
                        r++;
                        break;
                    case 1:
                        c++;
                        break;
                    case 2:
                        r--;
                        break;
                    case 3:
                        c--;
                        break;
                }
                if(room[r][c] == '.') {
                    if(visited[r][c]) {

                    }
                    else {
                        visited[r][c] = true;
                        result++;
                    }
                }
                else {
                    return result;
                }
            } else if(movements[i] == 'R') {
                changeDirection(1);
            } else if(movements[i] == 'L') {
                changeDirection(-1);
            }
        }
    return result;
    }

    public static void changeDirection (int change) {
        direction += change;
        if (direction == -1) {
            direction = 3;
        }
        else if (direction == 4) {
            direction = 0;
        }
    }
    public static void main( String[] args ) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str[] = reader.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            char[][] room = new char[n][m];
            for (int i = 0; i < n; i++) {
                char[] temp = reader.readLine().toCharArray();
                for(int j = 0; j < m; j++) {
                    room[i][j] = temp[j];
                }
            }
            String[] str2 = reader.readLine().split(" ");
            int r = Integer.parseInt(str2[0]) - 1;
            int c = Integer.parseInt(str2[1]) - 1;
            int q = Integer.parseInt(reader.readLine());
            char[] movements = reader.readLine().toCharArray();
            System.out.println(solve(room, r, c, movements));

        }
    }
}
