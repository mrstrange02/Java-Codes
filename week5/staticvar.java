
    /*public static void main(String[] args) {

        student s1=new student(1,"pavan");
        student s2=new student(2,"kalyan");
        s1.display();
        s2.display();

    }
}
class student{


    int roll;
    String name;
    static String college="rgukt";
    student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;

    }
    void display()
    {
        System.out.println(roll+" "+name+" "+college);
    }
}*/
 class staticvar {
    

static int c=0;
staticvar()
 {
    c++;
    System.out.println(c);
}


 static int square(int x)
    {
        return x*x;
    }
   
   
public static void main(String[] args)
 {
    staticvar s1=new staticvar();
    staticvar s2=new staticvar();
    
    int r=square(5);
    System.out.println(r);
}
}


