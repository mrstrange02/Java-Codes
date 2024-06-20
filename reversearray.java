import java.util.*;

public class reversearray {
    public static void reverse(int a[])
    {
       int low=0,high=a.length-1;
       while(low<high)
       {
        int temp=a[high];
        a[high]=a[low];
        a[low]=temp;

        low++;
        high--;
       }

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

        reverse(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
