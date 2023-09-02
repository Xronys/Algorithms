package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.three;

import java.io.*;


public class SolutionB {
    public static String[][] solve(int n, int m) {
        String[][] game = new String[n][m];
        game[0][0] = "Loose";


        for(int i = 1; i < n; i++) {
            if(i % 3 == 0) {
                game[i][0] = "Loose";
            }
            else{
                game[i][0] = "Win";
            }
        }
        for(int j = 1; j < m; j++) {
            if(j % 3 == 0) {
                game[0][j] = "Loose";
            }
            else{
                game[0][j] = "Win";
            }
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(game[i][j - 1].equals("Win") && game[i - 1][j].equals("Win")
                        && game[i - 1][j - 1].equals("Loose")) {
                    game[i][j] = "Loose";
                }
                else {
                    game[i][j] = "Win";
                }
            }
        }




        return game;
    }

    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] numbers = reader.readLine().split(" ");
            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);
            writer.write(solve(n + 1, m + 1)[n][m]);
        }
    }
}
