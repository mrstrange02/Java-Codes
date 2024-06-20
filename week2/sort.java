import java.util.*;
public class sort{


    public static void main(String []args)
    {
        int i,j,n,t;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the array size: ");
            n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("enter the elements: ");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
             for(j=i+1;j<n;j++)
             {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t; 
                }
             }
            }
     System.out.println("after sorting\n");
     for(i=0;i<n;i++)
     {
            System.out.printf("%d " ,a[i]);
   }
        }
    }
}

