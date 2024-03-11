package RunnableInterfaceApproach;

import java.util.concurrent.TimeUnit;

class PingRunnable implements Runnable {
    @Override
    public void run() {
        // Infinite loop to print "Ping" continuously
        while (true) {
            System.out.println("Ping");
            try {
                // Sleep for 1 second
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}