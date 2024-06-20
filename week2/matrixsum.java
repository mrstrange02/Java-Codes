import java.util.*;

public class matrixsum {
    public static void main(String[] args) {
        int r1,c1,r2,c2,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row1 & col1 size: ");
        
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("enter the row2 & col2 size: ");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int a[][]= new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c1];
        if(r1==r2 && c1==c2)
        {
        System.out.println("enter the elements of A: ");
        for(i=0;i<r1;i++)
        {
             for(j=0;j<c1;j++)
             {
                a[i][j]=sc.nextInt();
             }
        }
        System.out.println("enter the elements of B: ");
         for(i=0;i<r2;i++)
        {
             for(j=0;j<c2;j++)
             {
                b[i][j]=sc.nextInt();
             }
        }
     
        System.out.println("Sum of Matrices");
         for(i=0;i<r1;i++)
        {
             for(j=0;j<c1;j++)
             {
               c[i][j]=a[i][j]+b[i][j];
                  System.out.print(c[i][j]+" ");
    }
    System.out.println();


    
}
        }
        else
        {
            System.out.println("Unable to Sum");
        }
    }
}
