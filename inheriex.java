public class inheriex
{
    public static void main(String[] args) {
        dogs d= new dogs();
        d.eat();
        d.legs=5;
        System.out.println(d.legs);
    }
}
//base class
class animal
{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
}

class mammals extends animal
{
    int legs;

}

class dogs extends mammals{
    String breed;
}
//derived class
/*class fish extends animal{
    int fins;
    void swim()
    {
        System.out.println("swims in water");
    }
}*/