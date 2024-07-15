package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.three;

import java.io.*;
import java.util.*;

public class SolutionA {

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] input1 = reader.readLine().split(" ");
            int n = Integer.parseInt(input1[0]);
            int m = Integer.parseInt(input1[1]);
            Set<Integer> playerSet = new HashSet<>();
            for(int i = 1; i <= n; i++) {
                playerSet.add(i);
            }
            for(int i = 0; i < m; i++) {
                String[] input2 = reader.readLine().split(" ");
                int player1 = Integer.parseInt(input2[0]);
                int player2 = Integer.parseInt(input2[1]);
                int mathResult = Integer.parseInt(input2[2]);
                if(mathResult == 1) {
                    playerSet.remove(player2);
                }
                else if(mathResult == 2) {
                    playerSet.remove(player1);
                }
            }
            if(playerSet.size() == 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
