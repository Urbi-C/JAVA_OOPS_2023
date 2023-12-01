public class Demo {
    public static void main(String[] args) {
        // Creating objects of the Box class using different constructors
        Box box1 = new Box(); // Default constructor
        Box box2 = new Box(2.0, 3.0, 4.0); // Constructor with parameters

        // Displaying volumes of the boxes
        System.out.println("Volume of Box 1:");
        box1.displayVolume();

        System.out.println("\nVolume of Box 2:");
        box2.displayVolume();
    }
}
