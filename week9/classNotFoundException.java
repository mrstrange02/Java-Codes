 /*4. Exception Handling program for ClassNotFoundException--thrown if a program can not
find a class it depends at runtime (i.e., the class's ".class" file cannot be found or was
removed from the CLASSPATH).*/



public class classNotFoundException
{

    static void someMethod() throws ClassNotFoundException 
    {
      
        Class.forName("NonExistentClass");
    }

    public static void main(String[] args) 
    {
        try 
        {
            someMethod();
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
