package adt.c.linkedList;

public class Node {
    public int data;
    public Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public void displayNode() {
        System.out.println("{ "+this.data+" } ");
    }
}
