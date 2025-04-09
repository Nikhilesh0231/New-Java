package Server;

public class ServerThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Server thread started...");
        // Simulate listening
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
