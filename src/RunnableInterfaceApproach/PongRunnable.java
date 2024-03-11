package RunnableInterfaceApproach;

import java.util.concurrent.TimeUnit;

class PongRunnable implements Runnable {
    @Override
    public void run() {
        // Infinite loop to print "Pong" continuously
        while (true) {
            System.out.println("Pong");
            try {
                // Sleep for 1 second
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
