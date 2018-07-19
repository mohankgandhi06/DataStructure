package adt.d.doublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
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

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
        }
        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        //Node nextNode = first.next;
        if (!isEmpty()) {
            if (first.next != null) {
                first.next.previous = null;
            } else {
                last = null;
            }
            first = first.next;
        }
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (!isEmpty()) {
            if (last.previous != null) {
                last.previous.next = null;
            } else {
                first = null;
            }
            last = last.previous;
        }
        return temp;
    }

    public boolean insertAfter(int afterThisData, int dataToBeInserted) {
        Node temp = first;
        Node newNode = new Node();
        newNode.data = dataToBeInserted;
        while (temp != null) {
            if (temp.data == afterThisData) {
                if (temp.next == null) {//Last Node
                    last = newNode;
                    newNode.next = temp.next;
                    newNode.previous = temp;
                } else {
                    newNode.next = temp.next;
                    newNode.previous = temp;
                    temp.next.previous = newNode;
                    temp.next = newNode;
                }
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean deleteThis(int data) {
        Node temp = first;
        while (temp != null) {
            if (temp.data == data) {
                if (temp == first) {//First Node
                    first = temp.next;
                } else if (temp == last) {//Last Node
                    temp.previous.next = null;
                    last = temp.previous;
                } else {
                    temp.next.previous = temp.previous;
                    temp.previous.next = temp.next;
                }
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}