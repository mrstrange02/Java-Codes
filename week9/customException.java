
/*6. Create your own exception class using the extends keyword. Write a constructor for this
class that takes a String argument and stores it inside the object with a String reference.
Write a method that prints out the stored String. Create a try- catch clause to exercise your
new exception.*/




class MyCustomException extends Exception 
{
  
    private String errorMessage;

  
    public MyCustomException(String message) 
    {
        errorMessage = message;
    }

  
    public void printErrorMessage() 
    {
        System.out.println("Custom Exception: " + errorMessage);
    }
}

public class customException
{
    public static void main(String[] args)
    {
        try
        {
          
            throw new MyCustomException("This is a custom exception message.");

        }
        catch (MyCustomException e) 
        {
            
            e.printErrorMessage();
        }
    }
}

