import java.util.*;

public class rectangle {
    int length,breadth;
    void getarea(int l,int b)
    {
        length=l;
        breadth=b;
        int area=length*breadth;
        System.out.println("area "+area);

    }
    void getperimeter(int l,int b)
    {
        length=l;
        breadth=b;
        int perimeter=(2*(length+breadth));
         System.out.println("area "+perimeter);

     
    }
   
    public static void main(String[] args) {
        rectangle r=new rectangle();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter length and breadth: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            r.getarea(a,b);
            r.getperimeter(a,b);
    
        }
    }
}
