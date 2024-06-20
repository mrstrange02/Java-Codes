/*1. Program for demonstrating the use of throw, throws & finally - Create a class with a
main( ) that throws an object of class Exception inside a try block. Give the constructor
for Exception a String argument. Catch the exception inside a catch clause and print the
String argument. Add a finally clause and print a message to prove you were there.*/




class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

public class exceptionDemo
{

    public static void main(String[] args)
    {
        try 
        {
            throw new MyException("This is a custom exception message");
        } 
        catch (MyException e)
        {
          
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally 
        {
            System.out.println("Inside finally block - This will always be executed.");
        }
    }
}

