/*3. Write a program to rethrow an exception – Define methods one() & two(). Method two()
should initially throw an exception. Method one() should call two(), catch the exception
and rethrow it Call one() from main() and catch the rethrown*/




public class rethrowException
{

    static void two() throws Exception 
    {
        System.out.println("Method two() is throwing an exception");
        throw new Exception("Exception in method two()");
    }

    static void one() throws Exception 
    {
        try 
        {
            two();
        }
        catch (Exception e) 
        {
            System.out.println("Method one() caught the exception and is rethrowing it");
            throw e;
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            one();
        } 
        catch (Exception e)
        {
            System.out.println("Main method caught the rethrown exception: " + e.getMessage());
        }
    }
}

