package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SolutionE {
    public static Queue<SolutionD.Cell> queue = new LinkedList<>();

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

    public static void bfs(SolutionD.Cell cell, char[][] labyrinth, boolean[][] visited) {
        SolutionD.Cell result = null;
        SolutionD.Cell key = null;
        SolutionD.Cell door = null;
        boolean b1 = false;

        queue.add(cell);
        while (!queue.isEmpty()) {
            cell = queue.poll();
            visited[cell.i][cell.j] = true;
            int i = cell.i;
            int j = cell.j;
            if (i + 1 < labyrinth.length) {
                if (!visited[i + 1][j]) {
                    if (labyrinth[i + 1][j] == '.') {
                        queue.add(new
                                SolutionD.Cell(i + 1, j, cell.path + "D", cell.distance + 1));
                    } else if (labyrinth[i + 1][j] == 'F') {
                        result = new SolutionD.Cell(i + 1, j, cell.path + "D", cell.distance + 1);
                        break;
                    } else if (labyrinth[i + 1][j] == 'K') {
                        key = new SolutionD.Cell(i + 1, j, cell.path + "DP", cell.distance + 1);
                    } else if (labyrinth[i + 1][j] == 'D') {
                        door = new SolutionD.Cell(i + 1, j, cell.path + "D", cell.distance + 1);
                    }
                }
            }
            if (i - 1 >= 0) {
                if (!visited[i - 1][j]) {
                    if (labyrinth[i - 1][j] == '.') {
                        queue.add(new SolutionD.Cell(i - 1, j, cell.path + "U", cell.distance + 1));
                    } else if (labyrinth[i - 1][j] == 'F') {
                        result = new SolutionD.Cell(i - 1, j, cell.path + "U", cell.distance + 1);
                        break;
                    } else if (labyrinth[i - 1][j] == 'K') {
                        key = new SolutionD.Cell(i - 1, j, cell.path + "UP", cell.distance + 1);
                    } else if (labyrinth[i - 1][j] == 'D') {
                        door = new SolutionD.Cell(i - 1, j, cell.path + "U", cell.distance + 1);
                    }
                }
            }
            if (j + 1 < labyrinth[0].length) {
                if (!visited[i][j + 1]) {
                    if (labyrinth[i][j + 1] == '.') {
                        queue.add(new SolutionD.Cell(i, j + 1, cell.path + "R", cell.distance + 1));
                    } else if (labyrinth[i][j + 1] == 'F') {
                        result = new SolutionD.Cell(i, j + 1, cell.path + "R", cell.distance + 1);
                        break;
                    } else if (labyrinth[i][j + 1] == 'K') {
                        key = new SolutionD.Cell(i, j + 1, cell.path + "RP", cell.distance + 1);
                    } else if (labyrinth[i][j + 1] == 'D') {
                        door = new SolutionD.Cell(i , j + 1, cell.path + "R", cell.distance + 1);
                    }
                }
            }
            if (j - 1 >= 0) {
                if (!visited[i][j - 1]) {
                    if (labyrinth[i][j - 1] == '.') {
                        queue.add(new SolutionD.Cell(i, j - 1, cell.path + "L", cell.distance + 1));
                    } else if (labyrinth[i][j - 1] == 'F') {
                        result = new SolutionD.Cell(i, j - 1, cell.path + "L", cell.distance + 1);
                        break;
                    } else if (labyrinth[i][j - 1] == 'K') {
                        key = new SolutionD.Cell(i, j - 1, cell.path + "LP", cell.distance + 1);
                    } else if (labyrinth[i][j - 1] == 'D') {
                        door = new SolutionD.Cell(i, j - 1, cell.path + "R", cell.distance + 1);
                    }
                }
            }
            if(((key != null && door != null && key.distance + door.distance <= cell.distance) || queue.isEmpty()) && !b1) {
                b1 = true;
                StringBuilder sb = new StringBuilder(key.path.substring(0, key.path.length() - 2));
                sb.reverse();
                String tempPath = key.path + sb.toString();
                SolutionD.Cell temp = new SolutionD.Cell(door.i, door.j, tempPath, door.distance + key.distance + key.distance + 1);
                queue.add(temp);
            }
        }

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }



    }
    public static void main (String[]args) throws IOException {
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
            bfs(new SolutionD.Cell(sI, sJ, "", 0), labyrinth, visited);
        }
    }
}
// if not pass tests need to find shortcut from key to door, instead of moving from key to s and from s to door
//same as D

