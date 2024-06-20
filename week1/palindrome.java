//5. Write a java program to find whether given number is Palindrome or not

import java.util.*;
public class palindrome
{
public static void main(String[] args) 
{
    int n,rem,rev=0;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the number: ");
        n=sc.nextInt();
    }
    int p=n;
    while(n!=0)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;

    }
    if(p==rev)
    {
        System.out.println(p+" is palindrome");

    }

    else{
        System.out.println(" Not palindrome");
    }


    
}
}
