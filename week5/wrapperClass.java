/*public class wrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer i=a;
        int j=100;
        String s=Integer.toString(j);
        System.out.println(i);
        System.out.println(j+s);

    }
    
}*/


public class wrapperClass{
    public static void main(String[] args) {
        // Creating objects of wrapper classes using valueOf method
        Integer a = Integer.valueOf(10);
        Double b = Double.valueOf(3.14);
        Character c= Character.valueOf('A');
        Boolean d= Boolean.TRUE;

        // Displaying values using toString method
        System.out.println("Integer Value: " + a.toString());
        System.out.println("Double Value: " + b.toString());
        System.out.println("Character Value: " + c.toString());
        System.out.println("Boolean Value: " + d.toString());

        // Converting wrapper class objects to primitive data types
        int intValue = a.intValue();
        double doubleValue = b.doubleValue();
        char charValue = c.charValue();
        boolean boolValue = d  .booleanValue();

        System.out.println("\nConverted to Primitive Data Types:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);

        // Using static methods of wrapper classes
        String intStr = "123";
        int parsedInt = Integer.parseInt(intStr);
        System.out.println("\nParsed int value from String: " + parsedInt);

        String doubleStr = "3.14";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("Parsed double value from String: " + parsedDouble);

        // Autoboxing and Unboxing
        Integer autoboxedInt = 42; // Autoboxing
        int unboxedInt = autoboxedInt; // Unboxing
        System.out.println("\nAutoboxing and Unboxing:");
        System.out.println("Autoboxed Integer: " + autoboxedInt);
        System.out.println("Unboxed int: " + unboxedInt);
    }
}


