/*
package com.github.xronys.algorithms.v3;

*/
/*Дан неориентированный граф, возможно, с петлями и кратными ребрами. Необходимо построить компоненту связности,
содержащую первую вершину.*//*


*/
/*Формат ввода
В первой строке записаны два целых числа N (1 ≤ N ≤ 10^3) и M (0 ≤ M ≤ 5 * 10^5) — количество вершин и ребер в
графе. В последующих M строках перечислены ребра — пары чисел, определяющие номера вершин, которые соединяют ребра.*//*


*/
/*Формат вывода
В первую строку выходного файла выведите число K — количество вершин в компоненте связности.
Во вторую строку выведите K целых чисел — вершины компоненты связности, перечисленные в порядке возрастания номеров.*//*


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution31 {

    public class Graph {
        private int vertex;
        private List<Integer> adj[];
        public Graph(int vertex) {
            this.vertex = vertex;
            adj = new ArrayList[vertex];
            for(int n = 0; n < vertex; n++) {
                adj[n] = new ArrayList<Integer>();
            }
        }

        public void addEdge(int vertex, int edge) {
            adj[vertex].add(edge);
        }

        public void dfsRecursive(int current, boolean[] visited) {
            visited[vertex] = true;
            visit
        }
    }

    public static void main( String[] args ) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Integer> map = new HashMap<>();
        String[] str1 = reader.readLine().split(" ");
        int vertex = Integer.parseInt(str1[0]);
        int edge = Integer.parseInt(str1[1]);
        ArrayList<Integer> list[] = new ArrayList[vertex];
        for(int n = 0; n < vertex; n++) {
            String str[] = reader.readLine().split(" ");
            list[Integer.parseInt(str[0]) - 1] = new ArrayList<>();
            list[Integer.parseInt(str[0]) - 1].add(Integer.parseInt(str[1]));
            System.out.println(list[Integer.parseInt(str[0]) - 1]);
        }



    }
}
*/
