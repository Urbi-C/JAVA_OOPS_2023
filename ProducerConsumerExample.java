public  class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating threads
        Thread producerThread = new Thread(new Producer(sharedResource), "ProducerThread");
        Thread consumerThread = new Thread(new Consumer(sharedResource), "ConsumerThread");

        // Starting the threads
        producerThread.start();
        consumerThread.start();
    }
} 
    

