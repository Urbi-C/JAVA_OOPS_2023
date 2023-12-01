// InvalidInputException class
class InvalidInputException extends Exception {
    // Constructor that takes an integer and prints the exception message
    public InvalidInputException(int input) {
        super("InvalidInputException [" + input + "]");
    }
}
// TestPrime class
class TestPrime {
    // Method to check if a given number is prime
    public boolean isPrime(int number) throws InvalidInputException {
        if (number <= 1) {
            // Throw an exception for 0, 1, or any negative number
            throw new InvalidInputException(number);
        }

        // Check if the number is prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

