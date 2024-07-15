package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionC {
    public static Queue<Cell> queue = new LinkedList<>();

    public static class Cell {
        public int i;
        public int j;
        public String path;
        public int distance;

        public Cell(int i, int j, String path, int distance) {
            this.i = i;
            this.j = j;
            this.path = path;
            this.distance = distance;
        }

        @Override
        public String toString() {
            System.out.println(this.distance);
            return this.path;
        }
    }

    public static void bfs(Cell cell, char[][] labyrinth, boolean[][] visited) {
        Cell result = null;
        queue.add(cell);
        while (!queue.isEmpty()) {
            cell = queue.poll();
            visited[cell.i][cell.j] = true;
            int i = cell.i;
            int j = cell.j;
            if (i + 1 < labyrinth.length) {
                if (!visited[i + 1][j]) {
                    if (labyrinth[i + 1][j] == '.') {
                        queue.add(new Cell(i + 1, j, cell.path + "D", cell.distance + 1));
                    } else if (labyrinth[i + 1][j] == 'F') {
                        result = new Cell(i + 1, j, cell.path + "D", cell.distance + 1);
                        break;
                    }
                }
            }
            if (i - 1 >= 0) {
                if (!visited[i - 1][j]) {
                    if (labyrinth[i - 1][j] == '.') {
                        queue.add(new Cell(i - 1, j, cell.path + "U", cell.distance + 1));
                    } else if (labyrinth[i - 1][j] == 'F') {
                        result = new Cell(i - 1, j, cell.path + "U", cell.distance + 1);
                        break;
                    }
                }
            }
            if (j + 1 < labyrinth[0].length) {
                if (!visited[i][j + 1]) {
                    if (labyrinth[i][j + 1] == '.') {
                        queue.add(new Cell(i, j + 1, cell.path + "R", cell.distance + 1));
                    } else if (labyrinth[i][j + 1] == 'F') {
                        result = new Cell(i, j + 1, cell.path + "R", cell.distance + 1);
                        break;
                    }
                }
            }
            if (j - 1 >= 0) {
                if (!visited[i][j - 1]) {
                    if (labyrinth[i][j - 1] == '.') {
                        queue.add(new Cell(i, j - 1, cell.path + "L", cell.distance + 1));
                    } else if (labyrinth[i][j - 1] == 'F') {
                        result = new Cell(i, j - 1, cell.path + "L", cell.distance + 1);
                        break;
                    }
                }
            }
        }
        if(result != null) {
            System.out.println(result);
        }
        else {
            System.out.println("-1");
        }

    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = reader.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int sI = 0;
            int sJ = 0;
            char[][] labyrinth = new char[n][m];
            boolean[][] visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                char[] line = reader.readLine().toCharArray();
                for (int j = 0; j < line.length; j++) {
                    labyrinth[i][j] = line[j];
                    if (line[j] == 'S') {
                        sI = i;
                        sJ = j;
                    }
                }
            }
            bfs(new Cell(sI, sJ, "", 0), labyrinth, visited);
        }
    }
}
