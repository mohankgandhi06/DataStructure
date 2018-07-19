package adt.e.graph;

public class Vertex {
    public String data;
    public Node first;//Starting Node

    public Vertex() {

    }

    public Vertex(String data) {
        this.data = data;
        this.first = new Node();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void next(int nodeIndex){//Set the next node
        Node newNode = new Node();
        newNode.index = nodeIndex;
        newNode.next = this.first;
        this.first = newNode;
    }
}
