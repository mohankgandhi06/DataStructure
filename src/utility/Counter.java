package utility;

public class Counter {

    private String counterName;
    private int counter;

    public Counter(String str) {
        this.counterName = str;
        this.counter = 0;
    }

    public static void main(String [] args) {
        Counter counter = new Counter("globalCounter");
        counter.increment();
        System.out.println("Current Value is: " + counter.getCurrentValue());
        System.out.println("String Converted Value is: " + counter.toString());
    }

    public void increment() {
        System.out.println("Method to increment");
        this.counter++;
    }

    public int getCurrentValue() {
        return this.counter;
    }

    public String toString() {
        System.out.println("To String Conversion");
        return String.valueOf(this.counter);
    }
}
