

// Shared resource class
class SharedResource {
    private int x;
    private boolean isProduced;

    // Method for the producer to produce a value
    public synchronized void produce() {
        while (isProduced) {
            try {
                wait(); // Wait for the consumer to consume the value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Producing the value
        x++;
        System.out.println(Thread.currentThread().getName() + " produced: " + x);

        // Notify the consumer that a new value is available
        isProduced = true;
        notify();
    }

    // Method for the consumer to consume a value
    public synchronized void consume() {
        while (!isProduced) {
            try {
                wait(); // Wait for the producer to produce a value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Consuming the value
        System.out.println(Thread.currentThread().getName() + " consumed: " + x);

        // Notify the producer that the value has been consumed
        isProduced = false;
        notify();
    }
}

// Producer class
class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            sharedResource.produce();
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            sharedResource.consume();
        }
    }
}
