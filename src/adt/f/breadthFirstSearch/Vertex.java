package adt.f.breadthFirstSearch;

import java.util.List;

public class Vertex {
    private int[] edges;//
    private int distance;
    private int predeccesor;

    public Vertex() {

    }

    public boolean isEmpty() {
        return false;
    }

    public void next(int nodeIndex) {//Set the next node

    }

    public List<Integer> getListOfNodesToVisit() {
        return null;
    }

    public int[] getEdges() {
        return edges;
    }

    public void setEdges(int[] edges) {
        this.edges = edges;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPredeccesor() {
        return predeccesor;
    }

    public void setPredeccesor(int predeccesor) {
        this.predeccesor = predeccesor;
    }
}
