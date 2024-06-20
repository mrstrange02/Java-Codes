import java.util.*;
public class linearsearch {
    public static void main(String[] args)
     {
        int n,i,k,f=0;
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.printf("enter the size: ");
            n=sc.nextInt();
            int a[]=new int [n];
            System.out.printf("enter the elements: ");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.printf("enter the key: ");
            k=sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(k==a[i])
                {
                    f=1;
                    break;
                }
            }
    }
    if(f==1)
    {
        System.out.printf("element is found at the location %d ",i);
    }
    else
    {
        System.out.printf(" element is not found");
    }
}
}
    
    

