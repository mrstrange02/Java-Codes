import java.util.Scanner;

public class circle
 {
    double area,perimeter;
    void circleArea(double rad)
    {
        area=(3.14*rad*rad);
    } 
    void circlePerimeter(double rad)
    {
         perimeter=(2*3.14*rad);
    }
    void display()
    {
        System.out.println("Area of a Circle: "+area);
        System.out.println("Perimeter of a Circle: "+perimeter);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle c=new circle();
        System.out.println("enter the radius: ");
        double a=sc.nextDouble();

        c.circleArea(a);
        c.circlePerimeter(a);
        c.display();

    }
    
}
 
