//1. Write an application that uses String method compareTo to compare two strings
//defined by the user.



//package week4;
import java.util.*;

public class compareString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String1: ");
        String str1=sc.next();
        System.out.print("enter the String1: ");
        String str2=sc.next();
        int test=str1.compareTo(str2);
        if(test>0)
        {
            System.out.println("String1 is greater");
        }
        else if(test<0)
        {
            System.out.println("String2 is greater");
        }
        else
        {
            System.out.println("String1 and String2 are equal");
        }
        }


  
    
    }
    

