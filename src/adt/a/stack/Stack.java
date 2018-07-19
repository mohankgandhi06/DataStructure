package adt.a.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack (int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public static void main(String [] args) {
        Stack stackObject = new Stack(5);
        stackObject.push(50);
        stackObject.push(60);
        stackObject.push(70);
        stackObject.push(80);
        stackObject.push(90);
        stackObject.push(100);
        while (!stackObject.isEmpty()) {
            System.out.println("Popped item is : " + stackObject.pop());
        }
        stackObject.pop();
    }

    public void push(long pushedValue) {
        if (this.isFull()) {
            System.out.println("Already stack is full could not add the following value : " + pushedValue);
        }
        else {
            top++;
            stackArray[top] = pushedValue;
        }
    }

    public long pop() {
        if (isEmpty()){
            System.out.println("Already stack is empty. Could not pop");
            return -1;
        }
        else {
            int oldValue = top;
            top--;
            return stackArray[oldValue];
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

    public String reverseString(String stringInput) {
        return "";
    }
}
