import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataStructureWithEvenIterator<T> {
    private ArrayList<T> data;

    // Constructor to initialize the data structure
    public DataStructureWithEvenIterator() {
        this.data = new ArrayList<>();
    }

    // Method to add elements to the data structure
    public void addElement(T element) {
        data.add(element);
    }

    // Method to get the EvenIterator
    public EvenIterator getEvenIterator() {
        return new EvenIterator();
    }

    // Private inner class EvenIterator
    private class EvenIterator implements Iterator<T> {
        private int currentIndex;

        // Constructor
        private EvenIterator() {
            currentIndex = 0;
            // Adjust the index to the next even element if the first element is not even
            while (currentIndex < data.size() && currentIndex % 2 != 0) {
                currentIndex++;
            }
        }

        // Method to check if there is another even element
        @Override
        public boolean hasNext() {
            return currentIndex < data.size();
        }

        // Method to get the next even element
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T evenElement = data.get(currentIndex);
            currentIndex += 2; // Move to the next even index
            return evenElement;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of DataStructureWithEvenIterator
        DataStructureWithEvenIterator<Integer> dataStructure = new DataStructureWithEvenIterator<>();

        // Adding elements to the data structure
        dataStructure.addElement(1);
        dataStructure.addElement(2);
        dataStructure.addElement(3);
        dataStructure.addElement(4);
        dataStructure.addElement(5);

        // Getting and using the EvenIterator
        DataStructureWithEvenIterator.EvenIterator evenIterator = dataStructure.getEvenIterator();
        while (evenIterator.hasNext()) {
            System.out.println(evenIterator.next());
        }
    }
}
