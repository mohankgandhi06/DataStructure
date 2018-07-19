package adt.b.queue;

public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int noOfItems;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.noOfItems = 0;
    }

    public static void main(String [] args){
        Queue myQueue = new Queue(5);
        myQueue.insert(100L);
        myQueue.insert(150L);
        myQueue.insert(200L);
        myQueue.insert(250L);
        myQueue.insert(300L);
        myQueue.viewQueue();
        myQueue.remove();
        myQueue.remove();
        System.out.println("Peek : "+myQueue.peekFront());
    }

    public void insert(long queueItem) {
        if(isFull()) {
            System.out.println("Could not insert " + queueItem + ". The Queue is full, Please wait till existing gets removed");
        }
        else {
            rear++;
            queueArray[rear] = queueItem;
            noOfItems++;
        }
    }

    public long remove() {
        if (isEmpty()){
            System.out.println("Could not remove any more. The queue is already empty");
            return -404;
        }
        else {
            int removedLocation = front;
            front++;
            noOfItems--;
            return queueArray[removedLocation];
        }
    }

    public boolean isEmpty() {
        return (noOfItems == 0);
    }

    public boolean isFull() {
        return (noOfItems == maxSize);
    }

    public long peekFront(){
        return queueArray[front];
    }

    public void viewQueue() {
        System.out.print("The queue currently contains [");
        for (long queueItem : queueArray) {
            System.out.print(queueItem + " ");
        }
        System.out.print("]");
    }
}