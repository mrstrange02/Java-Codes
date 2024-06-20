import java.util.*;

public class bank
{

    String customerName;
    String accountNumber;
    String accountType;
    int initialAmount;
    int amount;

    public bank(int initialAmount,String customerName,String accountNumber,String accountType )
    {
        this.initialAmount= initialAmount;
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.accountType=accountType;

    }

    void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter amount to withdraw: ");
        amount=sc.nextInt();
        if(amount>initialAmount)
        {
            System.out.println("Sorry..You have Insufficient Balance");
        }
        else
        {
            initialAmount-=amount;
            System.out.println(amount+" is Sufficiently withdrawn");
            //getBalance();
        }

    }

    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to deposit: ");
        amount=sc.nextInt();
        initialAmount+=amount;
        System.out.println(amount+" Successfully Deposited..");
       // getBalance();
    }

    void getBalance()
    {
        System.out.println("Current Balance= "+initialAmount);
    }

    void getDetails()
    {
        System.out.println("Customer Name: "+customerName);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+initialAmount);
    }
    
    
    
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number : ");
        String accountNumber=sc.nextLine();
        System.out.println("enter Customer name : ");
        String customerName=sc.nextLine();
        System.out.println("enter account type : ");
        String accountType=sc.nextLine();
        System.out.println("enter account initial balance: ");
        int initialAmount=sc.nextInt();
        
        bank b=new bank(initialAmount,customerName,accountNumber,accountType);
        int check;
        while(true)
        {
            System.out.println("1.getbalance\n 2.deposit\n 3.withdraw\n 4.getDetails\n 5.exit\n");
            System.out.println("enter your choice: ");
            check=sc.nextInt();
            switch(check)
            {
                case 1:b.getBalance();
                break;
                case 2:b.deposit();
                break;
                case 3:b.withdraw();
                break;
                case 4:b.getDetails();
                break;
                case 5:System.exit(0);
                default:System.out.println("Invalid Choice");

        
            }
        }


        
    }

}
