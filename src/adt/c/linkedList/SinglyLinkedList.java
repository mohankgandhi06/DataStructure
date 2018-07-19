package adt.c.linkedList;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertAtTheBeginning(int nodeDataToBeInserted) {
        Node newNode = new Node();
        newNode.data = nodeDataToBeInserted;
        // I felt that next has to be pointing to null.
        // But everything we add gets inserted to the front, so this is correct
        // Because during the next line execution for the first time it will be null
        // On the subsequent call to this method it will point the previous first
        // which has been moved to the last
        newNode.next = first;
        first = newNode;
    }

    public void insertAtTheEnd(int nodeDataToBeInserted) {
        Node current = first;
        Node newNode = new Node();
        newNode.data = nodeDataToBeInserted;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Node deleteNodeAtTheBeginning() {
        Node temp = first;
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
