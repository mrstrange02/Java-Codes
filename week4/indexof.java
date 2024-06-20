//Write an application that uses String method indexOf to determine the total
//number of occurrences of any given alphabet in a defined text.


import java.util.*;

public class indexof {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the String1: ");
    String str1=sc.next();
    System.out.print("enter the character: ");
    char ch=sc.next().charAt(0);
    int count=0;
    int i;
    for(i=0;i<str1.length();i++)
    {
       
        if(str1.charAt(str1.indexOf(ch))==str1.charAt(i))
        {
        
            count++;
        }
        
    }
    System.out.println(ch+" is occures "+count+" times");



    //charAtOf.indexOf()N
    //System.out.print(str1.indexOf(ch));
    
}
}
