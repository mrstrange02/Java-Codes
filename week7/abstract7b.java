/*2. Create an abstract class Employee with methods getAmount() which displays the
amount paid to employee. Reuse this class to calculate the amount to be paid to
WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.*/

import java.util.*;
abstract class Employee
{
    abstract double getAmount();

}

class weeklyEmployeed extends Employee
{
   double amount;
   double weeks;
   double hours;
   public weeklyEmployeed(double amount,double weeks,double hours )
   {
    this.amount=amount;
    this.weeks=weeks;
    this.hours=hours;
   }
   double getAmount()
   {
    return amount*weeks*hours;

   }

}


class hourlyEmplyoeed extends Employee
{
   double amount;
   double hours;
    public hourlyEmplyoeed(double amount,double hours)
   {
    this.amount=amount;
    this.hours=hours;
   }
   double getAmount()
   {
    return amount*hours;

   }

}

public class abstract7b
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount:");
        double amount = sc.nextDouble();
        System.out.println("enter week:");
        double week=sc.nextDouble();
        System.out.println("enter hours:");
        double hour = sc.nextDouble();

        Employee e1=new weeklyEmployeed(amount,week,hour);
        System.out.println("weely employee "+e1.getAmount());
        Employee e2=new hourlyEmplyoeed(amount,hour);
        
  
       System.out.println("hourly emlployee "+e2.getAmount());
    }
}
