package adt.c.linkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertAtTheBeginning(int nodeDataToBeInserted) {
        Node newNode = new Node();
        newNode.data = nodeDataToBeInserted;
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertAtTheEnd(int nodeDataToBeInserted) {
        Node newNode = new Node();
        newNode.data = nodeDataToBeInserted;
        if (isEmpty()) {
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteNodeAtTheBeginning() {
        Node temp = first;
        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("The List contains the following: ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}