import java.util.Scanner;
class entrance
{
synchronized public void enter(int x)
{
System.out.println("Person "+x+" showed the ticket to the boy");
System.out.println("Person "+x+" entered the Theatre");
}
}
class person extends Thread
{
 int x;
 entrance s;
person(int y,entrance e)
{
 s=e;
 x=y;
 }
public void buyticket()
{
System.out.println("Person "+x+" bought the ticket");
}
public void run()
{
 buyticket();
 s.enter(x);
}
}

public class MovieTheatre
{
 public static void main(String args[])
 { 
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the no of persons:"); 
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
