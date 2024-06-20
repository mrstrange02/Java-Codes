class Example 
{
    int value;

    // Constructor
    public Example(int value) 
    {
        this.value = value;
    }
}

public class callby 
{
    // Method for call by value
    static void callByValue(int x)
     {
        System.out.println("Inside callByValue method - Before modification: x = " + x);
        x = 20;
        System.out.println("Inside callByValue method - After modification: x = " + x);
    }

    // Method for call by object
    static void callByObject(Example obj)
     {
        System.out.println("Inside callByObject method - Before modification: obj.value = " + obj.value);
        obj.value = 30;
        System.out.println("Inside callByObject method - After modification: obj.value = " + obj.value);
    }

    public static void main(String[] args)
     {
        // Call by value
        int number = 10;
        System.out.println("Before calling callByValue method: number = " + number);
        callByValue(number);
        System.out.println("After calling callByValue method: number = " + number);
        System.out.println();

        // Call by object
        Example exampleObj = new Example(25);
        System.out.println("Before calling callByObject method: exampleObj.value = " + exampleObj.value);
        callByObject(exampleObj);
        System.out.println("After calling callByObject method: exampleObj.value = " + exampleObj.value);
    }
}

