package SubClassApproach;

// Thread class for Ping
class PingThread extends Thread {
    @Override
    public void run() {
        // Infinite loop to print "Ping" continuously
        while (true) {
            System.out.println("Ping");
            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
