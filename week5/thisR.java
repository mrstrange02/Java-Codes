public class thisR {
    int id;
    String name;
    void insert(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        thisR t=new thisR();
        t.insert(12,"Pavan Kalyan");
        t.display();
    }

}
