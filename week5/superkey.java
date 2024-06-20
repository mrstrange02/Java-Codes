public class superkey {
    public static void main(String[] args) {
        c obj=new c();
        obj.display();
    }
    
}
class student
{
    String name="Pavan";
}
class c extends student
{
    String name="Kalyan";
    void display()
    {
        System.out.println(super.name);
        System.out.println(name);
    }
}
