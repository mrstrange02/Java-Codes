//8. Write an application that finds the substring from any given string using substring
//method and startsWith & endsWith methods.


import java.util.*;

public class substring {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str=sc.nextLine();
        System.out.print("enter the starting index: ");
        int start=sc.nextInt();
        System.out.print("enter the ending index: ");
        int end=sc.nextInt();
        System.out.print("substing of string: "+str.substring(start,end));
        

    }
}
