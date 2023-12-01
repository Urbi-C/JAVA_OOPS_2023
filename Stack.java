// Stack.java
public class Stack {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Default constructor
    public Stack() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Constructor with specified capacity
    public Stack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    // Method to push an element onto the stack
    public void push(Object element) {
        if (size == array.length) {
            // If the array is full, double its capacity
            resizeArray();
        }

        array[size++] = element;
    }

    // Method to pop an element from the stack
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }

        Object poppedElement = array[--size];
        array[size] = null; // Set the popped element to null to avoid memory leaks
        return poppedElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the current size of the stack
    public int size() {
        return size;
    }

    // Helper method to resize the array when it's full
    private void resizeArray() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
