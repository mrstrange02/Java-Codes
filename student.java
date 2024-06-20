import java.util.*;

public class student {
    int id;
    String name;
    void insert(int i,String n)
    {
        id=i;
        name=n;

    }
    void display()
    {
        System.out.println(id+""+name);
    }
    public static void main(String[] args) {
        student s=new student();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter id and name:");
        int a=sc.nextInt();
        String b=sc.nextLine();
        s.insert(a,b);
        s.display();
    
    }
 
    }
    

