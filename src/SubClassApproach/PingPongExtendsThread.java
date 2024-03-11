package SubClassApproach;

/**
 * Thread Subclass Approach:
 *
 * Usage: Extends the Thread class directly and overrides the run() method.
 *
 * Tight Coupling: Tightly couples the task logic with the threading mechanism within the same class.
 *
 * Less Flexible: Less flexible as the task logic and threading mechanism are inseparable.
 *
 * Code Reusability: Less reusable as the class is specifically designed for threading tasks.
 */

public class PingPongExtendsThread {
    public static void main(String[] args) {
        // Create and start Ping thread
        PingThread pingThread = new PingThread();
        pingThread.start();

        try {
            // Sleep for 0.5 seconds before doing other thread
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create and start Pong thread
        PongThread pongThread = new PongThread();
        pongThread.start();
    }
}

