     /*import java.util.*;
public class largesmall {
    public static void main(String[] args)
    {
        int a,b,c,d,e;
        System.out.println("enter a,b and c values: ");
        try (Scanner sc = new Scanner(System.in)) {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            e=sc.nextInt();
        }
        if(a>b && a>c && a>d && a>e)
        {
            System.out.println("Greatest number is "+a);
        }
        else if(b>c && b>d && b>e && b>a)
        {
            System.out.println("Greatest number is "+b);
        }
        else if(c>d && c>e && c>b)
        {
            System.out.println("Greatest number is "+c);
        }
        else if(d>e && d>c)
        {
            System.out.println("Greatest number is "+d);
        }
        else
        {
            System.out.println("Greatest number is "+c);
        }

    }
    
}*/




   
  import java.util.*;
  
  public class largesmall
  {
    public static void main(String [] args)
    {
       int[] num={8,3,10,2,11};
       int smallest=findSmallest(num);
       int largest=findLargest(num);
       System.out.println("smallest is "+smallest);
       System.out.print("largest  is "+largest);
       }
       
       public static  int findSmallest(int[] array)
       {
          int smallest=array[0];
          for(int i=1;i<array.length;i++)
          {
             if(array[i]<smallest)
             {
                smallest=array[i];
                }
                }
                return smallest;
                }
                
                
      public static int findLargest(int[] array)
       {
          int largest=array[0];
          for(int i=1;i<array.length;i++)
          {
             if(array[i]>largest)
             {
                largest=array[i];
                }
                }
                return largest;
                }
                }
         
