package com.github.xronys.algorithms.yandex.handbook.chapter.ten.paragraph.four;

import java.io.*;
import java.util.*;

public class SolutionA {
    public static void solve (Map<Integer,HashSet<Integer>> vertexes, Set<Integer> visited) {
    int result = 0;
    int index = 1;
    List<String> edges = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    visited.add(0);
    while (visited.size() < vertexes.size()) {
        if (queue.isEmpty()) {
            for (int i = index; i < vertexes.size(); i++) {
                if (!visited.contains(i)) {
                    index = i + 1;
                    queue.add(i);
                    visited.add(i);
                    result++;
                    edges.add((i + 1) + " " + i);
                    break;
                }
            }
        }
        Set<Integer> temp = vertexes.get(queue.poll());
        if (temp != null) {
            if (!visited.containsAll(temp)) {
                for (Integer i : temp) {
                    if (!visited.contains(i)) {
                        queue.add(i);
                        visited.add(i);
                    }
                }
            }
        }
    }
    System.out.println(result);
    if(result > 0) {
        for (int i = 0; i < edges.size(); i++) {
            System.out.println(edges.get(i));
        }
    }
    }
    public static void main(String[] args ) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
           String[] input = reader.readLine().split(" ");
           int n = Integer.parseInt(input[0]);
           int m = Integer.parseInt(input[1]);
           Set<Integer> visited = new LinkedHashSet<>();
           Map<Integer, HashSet<Integer>> vertexes = new HashMap<>();
           for(int i = 0; i < n; i++) {
               vertexes.put(i, new HashSet<>());
           }
           for(int i = 0; i < m; i++) {
               String[] line = reader.readLine().split(" ");
               int v = Integer.parseInt(line[0]);
               int e = Integer.parseInt(line[1]);
               vertexes.get(v - 1).add(e - 1);
           }
           solve(vertexes, visited);
        }
    }
}
