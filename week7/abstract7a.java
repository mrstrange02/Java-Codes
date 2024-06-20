
/*1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
and volume of square ,circle ,cube and sphere.*/

abstract class shapes
{
    abstract double Getarea();
    //abstract double volume();
}

class square extends shapes{
    double side;
    public square(double side)
    {
        this.side=side;
    }
    double Getarea()
    {
        return side*side;
    }

}
class circle extends shapes
{
    double rad;
    public circle(double rad)
    {
        this.rad=rad;
    }
    double Getarea()
    {
        return 3.14*rad*rad;
    }
}

class cube extends shapes
{
    double sides;
    public cube(double sides)
    {
        this.sides=sides;
    }
    double Getarea()
    {
        return 6*sides*sides;
    }
}

class sphere extends shapes{
    double rads;
    public sphere(double rads)
    {
        this.rads=rads;
    }
    double Getarea()
    {
        return 4*3.14*rads*rads;
    }
}

public class abstract7a
{
    public static void main(String[] args)
    {
        shapes s1=new circle(2);
        System.out.println("area of a circle "+s1.Getarea());
        shapes s2=new square(4);
        System.out.println("area of a square "+s2.Getarea());
        shapes s3=new cube(4);
        System.out.println("area of a cube "+s3.Getarea());
        shapes s4=new sphere(4);
        System.out.println("area of a spere "+s4.Getarea());

        
    }
}

