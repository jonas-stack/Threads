package LambdaExpressionApproach;

/**
 * Lambda Expression Approach:
 *
 * Usage: Creates and starts threads inline using lambda expressions.
 *
 * Conciseness: Provides a concise and compact syntax for defining thread logic directly within the Thread constructor.
 *
 * Readability: Can be less readable for complex tasks or longer code blocks compared to separate methods or classes.
 *
 * Flexibility: Offers flexibility similar to the Runnable approach but with a more concise syntax.
 */
public class PingPongDirectThreadClassUse {
    public static void main(String[] args) {
        // Create and start Ping thread
        new Thread(() -> {
            while (true) {
                System.out.println("Ping");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            // Sleep for 0.5 seconds before doing other thread
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create and start Pong thread
        new Thread(() -> {
            while (true) {
                System.out.println("Pong");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
