package adt.f.breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearch {
    private static List<Vertex> vertices;
    private static int[] visitedList = new int[ 8 ];//This has to be updated upon visiting the link
    private static int[] toVisitList = new int[ 8 ];//This has to be updated upon visiting the link
    private static int distanceCounter = 0;
    private static int visitedCounter = 0;
    private static int nextVisitNode = -1;


    public static void main(String[] args) {
        vertices = new ArrayList<Vertex>();
        for (int i = 0; i < 8; i++) {
            vertices.add(new Vertex());
        }
        vertices.get(0).setEdges(new int[]{});
        vertices.get(1).setEdges(new int[]{7, 4, 5});
        vertices.get(2).setEdges(new int[]{3, 4, 5});
        vertices.get(3).setEdges(new int[]{2, 6});
        vertices.get(4).setEdges(new int[]{1, 2});
        vertices.get(5).setEdges(new int[]{1, 2, 6});
        vertices.get(6).setEdges(new int[]{5, 6});
        vertices.get(7).setEdges(new int[]{1});

        performAssigningOfValues(3, 7, -1);

        displayTheShortestPath(7);

    }

    public BreadthFirstSearch() {

    }

    public static void performAssigningOfValues(int currentLocation, int goalLocation, int predecessor) {
        while (currentLocation != goalLocation) {
            if (distanceCounter == 0) {
                assignDistanceAndPredecessor(currentLocation, predecessor);
                distanceCounter++;
                visitedList[ visitedCounter ] = currentLocation;
                visitedCounter++;
                predecessor = currentLocation;
            }
            toVisitList = findNodesToVisit(vertices.get(currentLocation));
            int i = 0;
            for (i = toVisitList.length - 1; i >= 0; i--) {
                if (!isNodeAlreadyVisited(toVisitList[ i ])) {
                    nextVisitNode = toVisitList[i];
                    assignDistanceAndPredecessor(toVisitList[i], predecessor);
                    visitedList[ visitedCounter ] = toVisitList[ i ];
                    visitedCounter++;
                }
            }
            //predecessor = nextVisitNode;
            distanceCounter++;
            performAssigningOfValues(nextVisitNode, goalLocation, nextVisitNode);
            break;
        }
        //assignDistanceAndPredecessor(goalLocation, predecessor);
    }

    public static void displayTheShortestPath(int currentLocation) {
        System.out.print("Started From Goal: "+currentLocation+" -> ");
        while (vertices.get(currentLocation).getPredeccesor()!=-1){
            System.out.print(vertices.get(currentLocation).getPredeccesor()+" -> ");
            currentLocation = vertices.get(currentLocation).getPredeccesor();
        }
        System.out.print("End of Path");
    }

    public static int[] findNodesToVisit(Vertex currentNode) {
        return currentNode.getEdges();
    }

    public static boolean isNodeAlreadyVisited(int currentLocation) {
        for (int j = 0; j < visitedList.length; j++) {
            if (visitedList[ j ] == currentLocation) {
                return true;
            }
        }
        return false;
    }

    public static void assignDistanceAndPredecessor(int currentLocation, int predecessor) {
        vertices.get(currentLocation).setDistance(distanceCounter);
        vertices.get(currentLocation).setPredeccesor(predecessor);
    }
}