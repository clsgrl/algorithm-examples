package com.examples.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by gabriele on 03/11/18.
 */
public class GraphAdjacencyList {

    private Map<Integer, List<Integer>> adjancyListMap;

    public GraphAdjacencyList(int vertices) {
        this.adjancyListMap = new HashMap<>();

        IntStream.range(0, vertices).forEach(i -> this.adjancyListMap.put(i, new ArrayList<>()));
    }

    public boolean addEdge(int v1, int v2) {

        if (v1 > this.adjancyListMap.size() || v2 > this.adjancyListMap.size())
            return false;

        List<Integer> edgesOfv1 = this.adjancyListMap.get(v1);
        if (!edgesOfv1.contains(v2)) {
            edgesOfv1.add(v2);
        }
        List<Integer> edgesOfv2 = this.adjancyListMap.get(v2);
        if (!edgesOfv2.contains(v1)) {
            edgesOfv2.add(v1);
        }

        return true;
    }

    public static void main(String... args) {
        GraphAdjacencyList graphAdjacencyList = new GraphAdjacencyList(5);

        graphAdjacencyList.addEdge(1, 2);

        graphAdjacencyList.addEdge(5, 7);

        System.out.println("graph = "+graphAdjacencyList.toString());

    }

    @Override
    public String toString() {
        return adjancyListMap.toString();
    }


}
