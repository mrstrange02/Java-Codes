//2. Write an application that uses String method equals and equalsIgnoreCase to tests
//any two string objects for equality
import java.util.*;



public class equals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String1: ");
        String str1=sc.next();
        System.out.print("enter the String1: ");
        String str2=sc.next();
        System.out.println("Normal case: "+str1.equals(str2));
        //System.out.print("case Ignore: ");
        System.out.print("case Ignore: "+str1.equalsIgnoreCase(str2));

    }
    
}
