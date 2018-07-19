package adt.c.linkedList;

public class App {
    public static void main(String [] args) {
        /*//Plain Linked List Call
        Node nodeA = new Node();
        nodeA.data = 4;
        Node nodeB = new Node();
        nodeB.data = 3;
        Node nodeC = new Node();
        nodeC.data = 7;
        Node nodeD = new Node();
        nodeD.data = 8;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println("Length of the list is : "+listLength(nodeA));

        //Singly Linked List Call
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertAtTheBeginning(6);
        myList.insertAtTheBeginning(8);
        myList.insertAtTheBeginning(10);
        myList.insertAtTheEnd(100);
        myList.displayList();*/

        //Circular Linked List Call
        CircularLinkedList myCircularList = new CircularLinkedList();
        myCircularList.insertAtTheBeginning(100);
        myCircularList.insertAtTheBeginning(90);
        myCircularList.insertAtTheBeginning(70);
        myCircularList.insertAtTheBeginning(20);
        myCircularList.insertAtTheBeginning(10);
        myCircularList.insertAtTheEnd(9999);
        myCircularList.insertAtTheEnd(999999);
        myCircularList.insertAtTheEnd(99999999);
        myCircularList.deleteNodeAtTheBeginning();
        myCircularList.deleteNodeAtTheBeginning();
        myCircularList.deleteNodeAtTheBeginning();
        myCircularList.displayList();
    }

    public static int listLength(Node headNode) {
        int length = 0;
        while(headNode.next!=null) {
            length++;
            headNode = headNode.next;
        }
        return length+1;
    }
}
