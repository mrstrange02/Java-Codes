//4. Write an application that uses String method concat to concatenate two defined strings.
//6. Write an application that finds the length of a given string


import java.util.*;

public class concate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String1: ");
        String str1=sc.next();
        System.out.print("enter the String2: ");
        String str2=sc.next();
        System.out.println(str1.concat(str2));

        System.out.println(str1.length());


    

        
    }
    
}
