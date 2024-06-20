import java.util.*;
public class calci
{
    public static void main(String[]args)
    {
        int a,b;
        char oper;
           Scanner sc = new Scanner(System.in);
            System.out.println("enter the operator: ");
            oper=sc.next().charAt(0);
            System.out.println("enter the a and b values: ");
            a=sc.nextInt();
            b=sc.nextInt();
        
        switch(oper)
        {
             case '+':System.out.println("Additon is "+(a+b));
             break;
             case '-':System.out.println("Subtraction is "+(a-b));
             break;
             case '*':System.out.println("multiplication is "+(a*b));
             break;
             case '/':System.out.println("division is "+(a/b));
             break;
             default:System.out.println("Invalid");
        }
        



      

    }
}
