import java.util.*;

public class rectangle 
{
        int length,breadth;
        void getarea(int l,int b)
        {
            length=l;
            breadth=b;
            System.out.println(l*b);
        }
        void getperimeter(int l,int b)
        {
            length=l;
            breadth=b;
            System.out.println(2*(l+b));
        }
        public static void main(String[] args) {
            rectangle s= new rectangle();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("enter the length and breadth: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.print("Area of a Rectangle: ");
                s.getarea(a,b);
                System.out.print("Perimeter of a Rectangle: ");
                s.getperimeter(a,b);
            }
            
        }
        
    }
    

N