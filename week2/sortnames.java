import java.util.*;

public class sortnames {
    public static void main(String[] args) {
        int i,j,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of names: ");
            n=sc.nextInt();
            sc.nextLine();
            String s[]=new String[n];
            String t;
            System.out.println("enter the names: ");
            for(i=0;i<n;i++)
            {
                s[i]=sc.nextLine();
            }
            for(i=0;i<n;i++)
            
            {
                for(j=i+1;j<n;j++)
                {
                    if(s[i].compareTo(s[j])>0)
                    {
                        t=s[i];
                        s[i]=s[j];
                        s[j]=t;
                    }
                }
            }

                System.out.println("After Sorting the Names");
            for(i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }

}
}
