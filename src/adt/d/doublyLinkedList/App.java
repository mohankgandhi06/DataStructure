package adt.d.doublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList mylinkedList = new DoublyLinkedList();
        mylinkedList.insertFirst(10);
        mylinkedList.insertLast(90);
        mylinkedList.insertFirst(5);
        mylinkedList.insertAfter(5, 79);
        mylinkedList.insertFirst(1);
        mylinkedList.insertLast(95);
        mylinkedList.insertLast(100);
        mylinkedList.deleteFirst();
        mylinkedList.deleteLast();
        System.out.println(mylinkedList.deleteThis(95));
        mylinkedList.displayList();
    }

    public static int listLength(Node headNode) {
        int length = 0;
        while (headNode.next != null) {
            length++;
            headNode = headNode.next;
        }
        return length + 1;
    }
}
