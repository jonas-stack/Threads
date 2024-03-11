package OneThreadOneLoop;

import java.util.concurrent.TimeUnit;

public class OneThreadOneLoop {
    public static void main(String[] args) {
        // Create and start a single thread
        Thread pingPongThread = new Thread(() -> {
            // Variable to toggle between "Ping" and "Pong"
            boolean isPing = true;

            while (true) {
                // Print "Ping" or "Pong" based on the toggle state
                if (isPing) {
                    System.out.println("Ping");
                } else {
                    System.out.println("Pong");
                }

                // Toggle the state
                isPing = !isPing;

                try {
                    // Sleep for 1 second
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the thread
        pingPongThread.start();
    }
}

