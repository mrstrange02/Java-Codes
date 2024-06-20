//3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
//each number is read display it only if it’s not a duplicate of any number already read
//display the complete set of unique values input after the user enters each new value

import java.util.*;
public class unique{

 static int check(int k,int a[])
 {
   for(int i=0;i<a.length;i++)
   {
     if(k==a[i])
     {
      return 1;
      }
      } 
       return 0;
       }
       
        static void display(int a[],int length)
        {
        System.out.print("entered values are: ");
        for(int j=0;j<length;j++)
        {
           System.out.print(a[j]+" ");
         }
           System.out.println();
         }
         
        
 
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int j=0;
        System.out.println("enter the numbers: ");
        for(int i=0;i<a.length;i++)
        {
          int b=sc.nextInt();
          if(check(b,a)==1)
          {
          System.out.println("dublicate vales "+b+" already exits");
          i--;
          }
          
          else if(!(b>=10) ||!(b<=100))
          {
          System.out.println("enter the valid numbers between 10 and 100");
          i--;
          }
          else
          {
          a[i]=b;
          j++;
          display(a,j);
          }
          }
          }
          
          
    }

