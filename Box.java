public class Box {
    // Instance variables
    private double length;
    private double width;
    private double height;

    // Constructor with no parameters (default values)
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with all parameters
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to display the volume of the box
    public void displayVolume() {
        double volume = length * width * height;
        System.out.println("Volume of the box: " + volume);
    }
}

