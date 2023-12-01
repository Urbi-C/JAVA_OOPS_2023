import java.util.Iterator;

public class ArrayContainer {
    private int[] data;

    // Constructor to initialize the array
    public ArrayContainer(int[] data) {
        this.data = data;
    }

    // Method to get the EvenIterator
    public EvenIterator getEvenIterator() {
        return new EvenIterator();
    }

    // Private inner class EvenIterator
    private class EvenIterator implements Iterator<Integer> {
        private int currentIndex;

        // Constructor
        private EvenIterator() {
            currentIndex = 0;
            // Adjust the index to the next even element if the first element is not even
            while (currentIndex < data.length && data[currentIndex] % 2 != 0) {
                currentIndex++;
            }
        }

        // Method to check if there is another even element
        @Override
        public boolean hasNext() {
            return currentIndex < data.length;
        }

        // Method to get the next even element
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more even elements in the array.");
            }

            int evenElement = data[currentIndex];
            currentIndex += 2; // Move to the next even index
            return evenElement;
        }
    }

    public static void main(String[] args) {
        // Create an instance of ArrayContainer with an array
        int[] dataArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayContainer arrayContainer = new ArrayContainer(dataArray);

        // Get and use the EvenIterator
        ArrayContainer.EvenIterator evenIterator = arrayContainer.getEvenIterator();
        while (evenIterator.hasNext()) {
            System.out.println(evenIterator.next());
        }
    }

}
