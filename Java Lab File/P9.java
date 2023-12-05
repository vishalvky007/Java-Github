import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class SharedResource {
    // Using volatile for synchronization
    private volatile int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

class IncrementerThread extends Thread {
    private SharedResource sharedResource;

    public IncrementerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedResource.increment();
        }
    }
}

class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        IncrementerThread thread1 = new IncrementerThread(sharedResource);
        IncrementerThread thread2 = new IncrementerThread(sharedResource);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value: " + sharedResource.getCounter());

        // Write counter value to a file
        writeToFile("counter.txt", String.valueOf(sharedResource.getCounter()));
    }

    private static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(new File(fileName))) {
            writer.write(content);
            System.out.println("Counter value written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

