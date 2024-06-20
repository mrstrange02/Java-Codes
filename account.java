import java.util.*;


public class account {
    int amount;
    long account_number;
    //String account_type;
    String name;

    void withdraw(int am ,long ac,String n)
    {
        account_number=ac;
        //account_type=at;
        name=n;
        amount=am;
    
        if(amount>20000)
        {
          System.out.println("insuffient balance");
        }
        else{
            System.out.println("withdraw remaining "+(20000-amount));
        }
       
    }

    void deposit(int am,long ac,String n)
    {
         
        account_number=ac;
        //account_type=at;
        name=n;
       amount=am;
      System.out.println("deposit total "+(20000+amount));
    }

    
    public static void main(String[] args) {
        account aa=new account();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name: ");
        String d=sc.nextLine();

        System.out.println("enter amount");
        int a=sc.nextInt();

        System.out.println("enter account number: ");
        long b=sc.nextLong();

    System.out.println("name is "+d);
    System.out.println("Account number is "+b);
    System.out.println("Amount entered is "+a);

    
         aa.withdraw(a,b,d);
         aa.deposit(a,b,d);
        

    }

    
}
