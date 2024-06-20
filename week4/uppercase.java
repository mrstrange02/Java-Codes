//9. Write an application that changes any given string with uppercase letters, displays
//it, changes it back to lowercase letters and displays it.


package week4;
import java.util.*;

public class uppercase {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.print("enter the String1: ");
        String str1=sc.next();
        System.out.println("Upper case: "+str1.toUpperCase());
        System.out.println("original case: "+str1);
        
    
}
}
