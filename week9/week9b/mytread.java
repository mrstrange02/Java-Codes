//import java.util.*;

class mytread extends Thread
{
   public void run()
   {
    
    for(int i=0;i<5;i++)
    {
      System.out.println("production is not over");
      
      
    try
  {
  
    Thread.sleep(3000);
  }
  catch(Exception e)
  {
      
      }
      
      
      
      }
      
      System.out.println("total Production over....");
      }
      
      
      public static void main(String []args)
      {
         mytread t1=new mytread();
         t1.start();
         
      }
      }
      
   
   /* System.out.println("going to somewhere");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many products you want: ");
    int n=sc.nextInt();*/
    
    /*if(n<5)
    {
    
      System.out.println("production is not over");
      break;
      }
      else
      {
      
      System.out.println("total Production over....");
      break;
      }
      }*/
      
