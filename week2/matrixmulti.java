import java.util.*;

public class matrixmulti {
    public static void main(String[] args) {
        int r1,c1,r2,c2,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row1 & col1 size: ");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("enter the row2 & col2 size: ");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        if(r1==c2)
        {
        System.out.println("enter the elements of A: ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the elements of b: ");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        

         for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
               c[i][j]=0;
               for(k=0;k<c1;k++)
             {
                 c[i][j]=c[i][j]+a[i][k]*b[k][j];
              }

       }
        }
        System.out.println("Multiplication of Matrix: ");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {

                System.out.print(c[i][j]+" ");
    }
    System.out.println();
    
}
        }
        else
        {
            System.out.println("Unable to multiply");
        }
    }
}
