/*A mail-order house sells five products whose retail prices are as follows : Product
1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
and Product 5 : Rs. 40.49 . Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an application that reads a series of pairs of
numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product.
it should calculate and display the total retail value of all products sold.*/


import java.util.*;

public class product
 {
    public static void main(String[] args)
     {
    
       double product1=99.90;
       double product2=20.20;
       double product3=6.87;
       double product4=45.50;
       double product5=40.49;
       
        Scanner sc=new Scanner(System.in);
        int productId,quantity;
        double total=0.0;
        while(true)
        {
         System.out.print("1.dairy milk\n 2.munch\n 3.kacha mango\n 4.kitkat\n 5.milkybar\n");
         System.out.println("enter 0 to exit..\n");
         System.out.print("enter the product ID: ");
         productId=sc.nextInt();
         
         if(productId==0)
         {
           break;
           }
          /*if(productId<1||productId>5) 
           {
             System.out.print("Invalid Product Id");
             continue;
             }
             */
        
        System.out.print("enter the Quantity: ");
        quantity=sc.nextInt();
        switch(productId)
        {
            case 1:System.out.println(quantity*product1);
            total+=quantity*product1;
            break;
            case 2:System.out.println(quantity*product2);
            total+=quantity*product2;
            break;
            case 3:System.out.println(quantity*product3);
            total+=quantity*product3;
            break;
            case 4:System.out.println(quantity*product4);
            total+=quantity*product4;
            break;
            case 5:System.out.println(quantity*product5);
            total+=quantity*product5;
            break;
            default:System.out.println("Invalid");
            break;

        }
    }
    System.out.println("Total Amount is Rs "+total);
    
        

    }
    
}

