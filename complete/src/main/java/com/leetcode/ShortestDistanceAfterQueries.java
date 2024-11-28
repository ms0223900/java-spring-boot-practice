package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistanceAfterQueries {

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] distances = new int[n];
        for (int i = 0; i < n; i++) {
            distances[i] = n - 1 - i;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            graph.get(i + 1).add(i); // 由後往前鏈結成 graph
        }

        int[] result = new int[queries.length];
        int i = 0;

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            // When we add an edge from start to end, the shortest distance from start
            // should be either its current distance, or the distance from end plus 1
            // The +1 represents the one additional step needed to go from start to end
            graph.get(end).add(start);
            distances[start] = Math.min(distances[start], distances[end] + 1);

            // 更新從 start 出發的距離，因為 start 到 end 的距離變短了（由後往前更新）
            updateDistances(distances, graph, start);
            System.out.println(Arrays.toString(distances));

            result[i++] = distances[0];
        }

        return result;
    }

    private void updateDistances(int[] distances, List<List<Integer>> graph, int current) {
        int newDistance = distances[current] + 1;
        for (int neighbor : graph.get(current)) {
            if (distances[neighbor] > newDistance) {
                distances[neighbor] = newDistance;
                updateDistances(distances, graph, neighbor);
            }
        }
    }

}
