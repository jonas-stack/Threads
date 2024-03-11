package RunnableInterfaceApproach;

import java.util.concurrent.TimeUnit;

/**
 * Runnable Interface Approach:
 *
 * Usage: Implements the Runnable interface and passes instances of Runnable to Thread objects.
 *
 * Separation of Concerns: Separates the task logic (printing "Ping" or "Pong") from the threading mechanism (handled by Thread).
 *
 * Flexibility: More flexible as the same task logic can be executed by different threading mechanisms.
 *
 * Resource Management: Supports efficient resource management through thread pools or executor services.
 */

public class PingPongImplementsRunnable {
    public static void main(String[] args) {
        // Create Ping and Pong threads
        Thread pingThread = new Thread(new PingRunnable());
        Thread pongThread = new Thread(new PongRunnable());

        // Start the Ping thread
        pingThread.start();

        try {
            // Sleep for 0.5 seconds before doing other thread
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the Pong thread after 0.5 seconds
        pongThread.start();
    }
}

