package SubClassApproach;

// Thread class for Pong
class PongThread extends Thread {
    @Override
    public void run() {
        // Infinite loop to print "Pong" continuously
        while (true) {
            System.out.println("Pong");
            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
