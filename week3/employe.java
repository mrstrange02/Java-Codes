//1. Write a program to display details of the required employee based on his Id.
//The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
//Emp_salary, Emp_Address etc.,

import java.util.*;

public class employe {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of employees Size: ");
        int n=sc.nextInt();
        String details[][]=new String[n][7];
        for(int i=0;i<n;i++)
        {
            System.out.println("employee : "+(i+1));
            System.out.print("enter ID: ");
            details[i][0]=sc.next();
            System.out.print("enter name: ");
            details[i][1]=sc.next();
            System.out.print("enter age: ");
            details[i][2]=sc.next();
            System.out.print("enter gender:");
            details[i][3]=sc.next();
            System.out.print("enter designation: ");
            details[i][4]=sc.next();
            System.out.print("enter sallary: ");
            details[i][5]=sc.next();
            System.out.print("enter address: ");
            details[i][6]=sc.next();

        }
        
       
        System.out.print("enter the ID to find details:");
        String id=sc.next();
       System.out.println("Details by his/her ID: ");
        for(int i=0;i<n;i++)
        {
         if(details[i][0].equals(id))
         {
            System.out.println(" ID: "+details[i][0]);
        
            System.out.println(" name: "+details[i][1]);

            System.out.println(" age: "+details[i][2]);
            
            System.out.println(" gender:"+details[i][3]);

            System.out.println(" designation: "+details[i][4]);
           
            System.out.println(" sallary: "+details[i][5]);
           
            System.out.println(" address: "+details[i][6]);
            

         }
         else
         {
         System.out.println("Id is not available");
         
        }
    }
    }
   

    

}
