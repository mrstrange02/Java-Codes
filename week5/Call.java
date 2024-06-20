class Call
{
int age=21;
void change_age(int age){
age=age+10;
System.out.println("age in local:"+age);
}
public static void main(String aa [])
{
Call c1=new Call();
System.out.println("age before change:"+c1.age);
c1.change_age(10); System.out.println("age after change" +c1.age);
}
}
