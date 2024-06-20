/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively.*/



 class Employee
 {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName)
     {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }
}

class ContractEmployee extends Employee
 {
    String department;
    String designation;
    double salary;

    public ContractEmployee(String firstName, String lastName, String department, String designation, double salary) 
    {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String displayFullName() 
    {
        return "Full Name: " + getFirstName() + " " + getLastName();
    }

    public String getDepartment()
    {
        return department;
    }

    public String getDesig() {
        return designation;
    }

    public double calculateSalary() 
    {
        return salary;
    }
}

class RegularEmployee extends Employee 
{
     String department;
     String designation;
    double salary;

    public RegularEmployee(String firstName, String lastName, String department, String designation, double salary)
     {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String displayFullName()
    {
        return "Full Name: " + getFirstName() + " " + getLastName();
    }

    public String getDepartment() 
    {
        return department;
    }

    public String getDesig() 
    {
        return designation;
    }

    public double calculateSalary() 
    {
    
        return salary;
    }
}

public class EmployeeApplication
{
    public static void main(String[] args) 
    {
        ContractEmployee con = new ContractEmployee("Pavan", "Kalyan", "CSE", "Contractor", 100000);
        RegularEmployee reg= new RegularEmployee("Bruno", "Unique", "HR", "Manager", 120000);
        
        System.out.println("Contract Employee...");
        System.out.println(con.displayFullName());
        System.out.println("Department: " + con.getDepartment());
        System.out.println("Designation: " + con.getDesig());
        System.out.println("Calculated Salary: $" + con.calculateSalary());

        System.out.println("\n");


          System.out.println("Regular Employee...");
        System.out.println(reg.displayFullName());
        System.out.println("Department: " + reg.getDepartment());
        System.out.println("Designation: " + reg.getDesig());
        System.out.println("Calculated Salary: $" + reg.calculateSalary());
    }
}
