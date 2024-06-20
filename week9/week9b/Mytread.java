class Mytread extends Thread
{
    public void run()
    {
    System.out.println("Thread is walking");
    }
    
public static void main(String []args)
{
   Mytread t1=new Mytread();
   t1.start();
   }
   }
