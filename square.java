import java.util.*;

public class square {
   int side;
   void getarea(int s)
   {
        side=s;
        System.out.println("area "+(side*side));

   }
   void getperimeter(int s)
   {
    side=s;
    System.out.println("perimter "+(4*side));

   }
    
    public static void main(String[] args) {
        square s=new square();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the side:" );
            int a=sc.nextInt();
            s.getarea(a);
            s.getperimeter(a);
        }
    
    }
    
}
