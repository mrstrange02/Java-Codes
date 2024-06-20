//9. Write an application that changes any given string with uppercase letters, displays
//it, changes it back to lowercase letters and displays it.

import java.util.*;

public class vowelscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str=sc.next();
        char ch;
        
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)>='A'||str.charAt(i)>='a' && str.charAt(i)<='Z'|| str.charAt(i)<='z')
         {
         ch=str.charAt(i);
        
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            vowels++;
        }
        else
        {
            consonants++;
        }
    }
    }  
    
    System.out.println("Vowels: "+vowels);
    System.out.println("Consonantts: "+consonants);
    
}

    
}
