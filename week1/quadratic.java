import java.util.*;
import java.lang.Math;
 class quadratic
{

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

      
        System.out.print("Enter the  a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the  b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the c: ");
        double c = scanner.nextDouble();

       
        double discriminant = b*b-4*a*c;

        if (discriminant>=0) {
           
            double root1=(-b + Math.sqrt(discriminant))/ (2 * a);
            double root2=(-b - Math.sqrt(discriminant))/ (2 * a);

            System.out.println("Real Solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Imaginary Solutions:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        
    }
}

    
        


        
   
