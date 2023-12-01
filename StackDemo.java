// TestStack.java
public class StackDemo {
    public static void main(String[] args) {
        // Testing the Stack class with different data types

        // Creating a stack of integers
        Stack intStack = new Stack();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Integer Stack Size: " + intStack.size());

        while (!intStack.isEmpty()) {
            System.out.println("Popped from Integer Stack: " + intStack.pop());
        }

        // Creating a stack of strings
        Stack stringStack = new Stack();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("String Stack Size: " + stringStack.size());

        while (!stringStack.isEmpty()) {
            System.out.println("Popped from String Stack: " + stringStack.pop());
        }

        // Creating a stack of doubles
        Stack doubleStack = new Stack();
        doubleStack.push(3.14);
        doubleStack.push(2.71);

        System.out.println("Double Stack Size: " + doubleStack.size());

        while (!doubleStack.isEmpty()) {
            System.out.println("Popped from Double Stack: " + doubleStack.pop());
        }
    }
}
