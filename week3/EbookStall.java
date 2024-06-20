

  class Book {
     String bookName;
     String bookAuthor;
     int bookCount;

    // Constructor
    public Book(String bookName, String bookAuthor, int bookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }

    // Getter methods
    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookCount() {
        return bookCount;
    }

    // Method to sell a book to a customer
    public void sellBook()
     {
        if (bookCount > 0)
         {
            bookCount--;
            System.out.println("Book sold: " + bookName);
           // System.out.println("Remaining count of " + bookName + ": " + bookCount);
        } 
        else 
        {
            System.out.println("Sorry, the book '" + bookName + "' is out of stock.");
        }
    }
}

class Customer {
     int customerId;
    String customerName;
     String customerAddress;

    // Constructor
    public Customer(int customerId, String customerName, String customerAddress) 
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    // Method to buy a book from the E-Book stall
    public void buyBook(Book b)
     {
        System.out.println("Customer " + customerName + " with ID " + customerId + " is buying a book.");
        b.sellBook();
    }
}

public class EbookStall {
    public static void main(String[] args) {
    
    System.out.println("Total No of books is 10");
        // Create a sample book
        Book b= new Book("Java Programming", "John Doe", 10);

        // Create a sample customer
        Customer cust1= new Customer(1, "Alice", "123 Main Street");
        Customer cust2=new Customer(2,"pavan","Siddipet");

        // Customer buys a book
        cust1.buyBook(b);
        cust2.buyBook(b);

        // Display the remaining count after the purchase
        System.out.println("Remaining count of " + b.getBookName() + ": " + b.getBookCount());
    }
}

