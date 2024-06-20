//4. Write a java program to find prime factors of given number

import java.util.*;

public class primeFactors
{
 public static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number: ");
    int num=sc.nextInt();
     
     System.out.println("prime factors of "+ num +" are ");
     
     printPrimeFactors(num);
     }
     
     
     
     public static void printPrimeFactors(int num)
     {
        while(num%2==0)
        {
          System.out.print(2 + " ");
          num/=2;
          }
          
           for(int i=3;i<=Math.sqrt(num);i+=2)
           {
              while(num%i==0)
              {
                 System.out.print(i+" ");
                  num/=i;
                  }
                  }
                  
                  if(num>2)
                  {
                  System.out.print(num);
                  }
                  }
                  }
