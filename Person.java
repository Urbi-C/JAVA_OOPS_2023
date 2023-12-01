public class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display biodata
    public void displayBiodata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("John Doe", 25, "123 Main St");
        Person person2 = new Person("Jane Smith", 30, "456 Oak St");

        // Displaying biodata for each person
        System.out.println("Biodata for Person 1:");
        person1.displayBiodata();

        System.out.println("\nBiodata for Person 2:");
        person2.displayBiodata();
    }
}
