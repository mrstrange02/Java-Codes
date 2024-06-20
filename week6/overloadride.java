//2. Write a Java program which can give example of Method overloading and overriding

public class overloadride {
    public static void main(String[] args) {
    adder ad=new adder();
    
        System.out.println(ad.sum(2,3));
        System.out.println(ad.sum(2,3,6));

         B obj=new B();
         obj.display();
    }
    
}
class adder
{
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}

class A{
    void display()
    {
        System.out.println("parent");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("child");
    }
}



