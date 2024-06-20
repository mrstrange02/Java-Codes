import java.util.*;

public class binarysearch {
    public static int binary(int a[],int key)
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
             if(a[mid]==key)
             {
                return mid;

             }
             else if(a[mid]<key)
             {
                low=mid+1;
             } 
             else
             {
                high=mid-1;
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the elements: ");
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
        }
        System.out.print("enter the key: ");   
        int key=sc.nextInt();
        System.out.print("found at "+binary(a,key));
    }
    
}