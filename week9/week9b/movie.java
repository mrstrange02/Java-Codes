import java.util.*;
 class entrance
 {
     synchronized public void enter(int x)
     {
        System.out.println("person "+x+"showed the ticket to the boy");
        System.out.println("person "+x+"entered into theatre");
        }
        
        }
        
        class person extends Thread
        {
           int y;
           entrance e;
           person(int y,entrance e)
           {
               this.y=y;
               this.e=e;
               }
               
             public void buyticket()
             {
               System.out.println("person "+y+" bought the ticket");
               }
               public void run()
               {
                buyticket();
                e.enter(y);
                }
                }
                
                class movie
                {
                  public static void main(String []args)
                  {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("enter the no of persons");
                    int n=sc.nextInt();
                    
                    person p[]=new person[n+1];
                    
                    entrance e=new entrance();
                    for(int i=1;i<=n;i++)
                    {
                       p[i]=new person(i,e);
                       }
                       
                       for(int i=1;i<=n;i++)
                       {
                        p[i].start();
                        }
                        }
                        }
                       
                    
               
    
