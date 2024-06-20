/*2. Write a program that shows that the order of the catch blocks is important. If you try to
catch a superclass exception type before a subclass type, the compiler should generate
errors.*/


public class catchBlockOrder 
{
    public static void main(String[] args)
    {
        int a[]={1,2,9,3,0,10};
        try
        {
            System.out.println(a[10]);
            int r= a[3]/a[4];
            System.out.println(r);
            
        }
        catch ( Exception e)
        {
            System.out.println(e);
        }
        catch( ArithmeticException b)
        {
            System.out.println(b);


        }
    }
    
}
