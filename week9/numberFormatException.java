/*5. Exception Handling program for NumberFormatException--thrown if a program is
attempting to convert a string to a numerical datatype, and the string contains
inappropriate characters (i.e. 'z' or 'Q').*/



public class numberFormatException
{

    static void convertStringToNumber(String str)
    {
        try 
        {
            
            int number = Integer.parseInt(str);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
      
        convertStringToNumber("123");

        convertStringToNumber("abc");
    }
}

