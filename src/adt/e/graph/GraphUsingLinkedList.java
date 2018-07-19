package adt.e.graph;

public class GraphUsingLinkedList {

    private Vertex[] vertices;
    private int vertexCount;
    private boolean directionalType = false;

    public static void main(String[] args) {
        GraphUsingLinkedList myGraph = new GraphUsingLinkedList(5, "directional");
        myGraph.addVertex("State");
        myGraph.addVertex("Avenel");
        myGraph.addVertex("Elm");
        myGraph.addVertex("Pocono");
        myGraph.addVertex("William");

        myGraph.addEdge("State", "Elm");
        myGraph.addEdge("Elm", "Avenel");
        myGraph.addEdge("Elm", "William");
        myGraph.addEdge("William", "State");
        myGraph.addEdge("William", "Pocono");
        myGraph.addEdge("Avenel", "Pocono");
        myGraph.addEdge("Pocono", "Elm");

        myGraph.showGraph();
    }

    public GraphUsingLinkedList() {

    }

    public GraphUsingLinkedList(int size, String type) {
        this.vertices = new Vertex[ size ];
        if (type.equalsIgnoreCase("directional")) {
            this.directionalType = true;
        }
    }

    public void addVertex(String data) {
        if (vertexCount < vertices.length) {
            Vertex newVertex = new Vertex(data);
            this.vertices[ vertexCount ] = newVertex;
            vertexCount++;
        } else {
            System.out.println("Out of Vertices. Please Remove any existing entry and proceed");
        }
    }

    public void addEdge(String fromData, String toData) {
        int indexToBeAdded = -1;
        for (int k = 0; k < this.vertices.length; k++) {
            if (this.vertices[ k ].getData().equalsIgnoreCase(toData)) {
                indexToBeAdded = k;
                break;
            }
        }
        if (indexToBeAdded != -1) {
            for (int i = 0; i < this.vertices.length; i++) {
                if (this.vertices[ i ].getData().equalsIgnoreCase(fromData)) {
                    this.vertices[ i ].next(indexToBeAdded);
                    break;
                }
            }
        }
        //System.out.println("Vertex "+fromData+" not found");
    }

    public void removeVertex(String data) {
        for (Vertex vertex : this.vertices) {
            if (vertex.getData().equalsIgnoreCase(data)) {
                //Remove the Edges related to it from each of the Vertex and then remove the edge
            }
        }
        //System.out.println("Vertex "+data+" not found");
    }

    public void removeEdge(String fromData, String toData) {

    }

    public void adjacentOf(String data) {

    }

    public void showGraph() {
        for (Vertex vertex : this.vertices) {
            System.out.print("Vertex: " + vertex.data + " : Edges : ");
            Node node = vertex.first;
            while (node.next != null) {
                System.out.print(" --> " + this.vertices[node.index].data);
                node = node.next;
            }
            System.out.println("");
        }
    }
}
