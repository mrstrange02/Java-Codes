class traffic extends Thread
{
    public void run()
    {
       System.out.println("RED is glowing....");
       System.out.println("Please Stop the Vehicle");
       try
       {
         Thread.sleep(10000);
         }
         catch(Exception e){};
         System.out.println("Red is Stopped X");
         
         System.out.println();
         System.out.println("Yellow is glowing....");
         System.out.println("Set Ready the Vehicle");
         try
       {
         Thread.sleep(10000);
         }
         catch(Exception e){};
         System.out.println("Yellow is Stopped X");
         
         System.out.println();
         
         System.out.println("Green is glowing....");
         System.out.println("Lets Go.................................");
       try
       {
         Thread.sleep(10000);
         }
         catch(Exception e){};
        }
        
        public static void main(String []args)
        {
           traffic tc=new traffic();
           tc.start();
           }
           }
         
         
         
         
