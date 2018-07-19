package adt.e.graph;

import java.util.ArrayList;

public class Graph {

    public static int verticesCount;
    public static int edgesCount;
    public static ArrayList[] adjacentVertices;

    public static void main(String[] args) {
        Graph myGraph = new Graph(5);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(0, 4);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(2, 4);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 1);
        Object[] result = myGraph.adjacentOf(0);
        for (Object vertex : result) {
            System.out.println(vertex);
        }
    }

    public Graph() {

    }

    public Graph(int graphSize) {
        this.verticesCount = graphSize;
        this.edgesCount = 0;
        this.adjacentVertices = new ArrayList[ graphSize ];
        for (int i = 0; i < verticesCount; i++) {
            adjacentVertices[ i ] = new ArrayList();
        }
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    public int getEdgesCount() {
        return edgesCount;
    }

    public void addEdge(int startingVertex, int endingVertex) {
        adjacentVertices[ startingVertex ].add(endingVertex);
        edgesCount++;
    }

    public Object[] adjacentOf(int vertex) {
        return adjacentVertices[ vertex ].toArray();
    }

}
