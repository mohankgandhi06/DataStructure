package adt.a.stack;

public class CharacterStack {

    private int maxSize;
    private char[] charArray;
    private int top;

    public CharacterStack (int maxSize) {
        this.maxSize = maxSize;
        this.charArray = new char[maxSize];
        this.top = -1;
    }

    public static void main(String [] args) {
        System.out.println("Reversed String is : " + reverseString("MOHAN"));
    }

    public static String reverseString(String stringInput) {
        String reversedStringValue = new String();
        CharacterStack characterStack = new CharacterStack(stringInput.length());
        for(int i=0; i < stringInput.length(); i++) {
            characterStack.push(stringInput.charAt(i));
        }
        for (int j=0; j < characterStack.maxSize ; j++) {
            reversedStringValue = reversedStringValue + characterStack.pop();
        }
        return reversedStringValue;
    }

    public void push(char pushedValue) {
        if (this.isFull()) {
            System.out.println("Already stack is full could not add the following value : " + pushedValue);
        }
        else {
            top++;
            charArray[top] = pushedValue;
        }
    }

    public char pop() {
        if (isEmpty()){
            System.out.println("Already stack is empty. Could not pop");
            return '0';
        }
        else {
            int oldValue = top;
            top--;
            return charArray[oldValue];
        }
    }

    public long peak() {
        return charArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }
}
