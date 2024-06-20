// Payable interface
interface Payable
 {
    double getAmount();
}

// Invoice class implementing Payable interface
class Invoice implements Payable
 {
    private double invoiceAmount;

    // Constructor
    public Invoice(double invoiceAmount)
     {
        this.invoiceAmount = invoiceAmount;
    }

    // Implementation of the getAmount() method for Invoice
    @Override
    public double getAmount() 
    {
        // You can implement your own logic for calculating the amount for Invoice
        // For simplicity, returning the invoice amount as is in this example
        return invoiceAmount;
    }
}

// Employee class implementing Payable interface
class Employee implements Payable
 {
    double salary;

    // Constructor
    public Employee(double salary) 
    {
        this.salary = salary;
    }

    // Implementation of the getAmount() method for Employee
    @Override
    public double getAmount() 
    {
        // You can implement your own logic for calculating the amount for Employee
        // For simplicity, returning the salary as is in this example
        return salary;
    }
}

// Main class for testing
public class interface7c {
    public static void main(String[] args) {
        // Creating an Invoice and an Employee
        Invoice invoice = new Invoice(1000.0);
        Employee employee = new Employee(50000.0);

        // Using the getAmount() method for both Invoice and Employee
       // double invoiceAmount = invoice.getAmount();
      //  double employeeAmount = employee.getAmount();

        // Printing the calculated amounts
        System.out.println("Amount to be paid for Invoice: $" + invoice.getAmount());
        System.out.println("Amount to be paid to Employee: $" + employee.getAmount());
    }
}

