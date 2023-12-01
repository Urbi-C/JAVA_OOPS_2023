public class Test1 {
    public static void main(String[] args) {
        // Create an instance of TestPrime
        TestPrime testPrime = new TestPrime();

        // Test the functionality of isPrime method
        try {
            int inputNumber = -10; // Change the input to test different numbers
            boolean isPrime = testPrime.isPrime(inputNumber);
            System.out.println(inputNumber + " is prime: " + isPrime);
        } catch (InvalidInputException e) {
            // Print the exception message for invalid input
            System.out.println(e.getMessage());
        }
    }
}
