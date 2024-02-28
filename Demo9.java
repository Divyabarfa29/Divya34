class Demo9
 {
    public static void main(String[] args) {
        // Creating a daemon thread
        Thread daemonThread = new Thread(() ->
		{
            while (true) {
                System.out.println("Daemon thread is running...");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });

        // Setting the thread as daemon 
        daemonThread.setDaemon(true);
        daemonThread.start();

        // Main thread
        System.out.println("Main thread is finishing...");
    }
}