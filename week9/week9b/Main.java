public class Main {
    // Flag to indicate whether production is over
   static boolean isProductionOver = false;

    // Producer thread class
    static class Producer extends Thread
     {
       
        public void run()
         {
            // Simulating data production
            for (int i = 0; i < 10; i++)
             {
                System.out.println("Producing data: " + i);
                try
                 {
                    Thread.sleep(100); // Simulate some delay
                } 
                catch (InterruptedException e)
                 {
                    e.printStackTrace();
                }
            }
            
            isProductionOver = true; // Set flag to indicate production is over
            System.out.println("Production is over.");
        }
    }

    // Consumer thread class
    static class Consumer extends Thread 
    {
       
        public void run() 
        {
            while (!isProductionOver) 
            { // Continue consuming until production is over
                System.out.println("Consuming data...");
                try 
                {
                    Thread.sleep(10); // Check production status every 10 ms
                }
                 catch (InterruptedException e) 
                 {
                    e.printStackTrace();
                }
            }
            System.out.println("Stopped consuming as production is over.");
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        producer.start();
        consumer.start();
    }
}

