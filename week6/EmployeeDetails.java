
/*import java.util.*;
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

    public ContractEmployee(String firstName, String lastName) 
    {
        super(firstName, lastName);
        setEmployeeDetails();
    }

     void setEmployeeDetails() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department: ");
        this.department = sc.nextLine();

        System.out.print("Enter designation: ");
        this.designation = sc.nextLine();
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

class HourlyEmployee extends ContractEmployee
 {
    int hours;
    double wagesPerHour;

    public HourlyEmployee(String firstName, String lastName)
    {
        super(firstName, lastName);
        setEmployeeDetails();
    }

     void setEmployeeDetails() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours worked: ");
        this.hours = sc.nextInt();

        System.out.print("Enter wages per hour: ");
        this.wagesPerHour = sc.nextDouble();

       
        this.salary = calculateWages();
    }


    public String getDesig()
    {
        return "Hourly " + super.getDesig();
    }

    public double calculateWages() 
    {
        return hours*wagesPerHour*4; // Assuming 4 weeks in a month
    }
}

class WeeklyEmployee extends ContractEmployee 
{
     int weeks;
     double wagesPerWeek;

    public WeeklyEmployee(String firstName, String lastName) 
    {
        super(firstName, lastName);
        setEmployeeDetails();
    }

     void setEmployeeDetails() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of weeks worked: ");
        this.weeks = sc.nextInt();

        System.out.print("Enter wages per week: ");
        this.wagesPerWeek = sc.nextDouble();

        this.salary = calculateWages();
    }

    public String getDesig() 
    {
        return "Weekly " + super.getDesig();
    }

    public double calculateWages() 
    {
        return weeks * wagesPerWeek;
    }
}

public class EmployeeDetails {
    public static void main(String[] args)
     {
        HourlyEmployee hourlyEmployee = createHourlyEmployee();
        WeeklyEmployee weeklyEmployee = createWeeklyEmployee();

        System.out.println(hourlyEmployee.displayFullName());
        System.out.println("Department: " + hourlyEmployee.getDepartment());
        System.out.println("Designation: " + hourlyEmployee.getDesig());
        System.out.println("Calculated Salary: $" + hourlyEmployee.calculateSalary());

        System.out.println("\n");

        System.out.println(weeklyEmployee.displayFullName());
        System.out.println("Department: " + weeklyEmployee.getDepartment());
        System.out.println("Designation: " + weeklyEmployee.getDesig());
        System.out.println("Calculated Salary: $" + weeklyEmployee.calculateSalary());
    }
    

    private static HourlyEmployee createHourlyEmployee() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hourly Employee First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Hourly Employee Last Name: ");
        String lastName = sc.nextLine();

        return new HourlyEmployee(firstName, lastName);
    }

    private static WeeklyEmployee createWeeklyEmployee() {
        Scanner sc= new Scanner(System.in);///

        System.out.print("Enter Weekly Employee First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Weekly Employee Last Name: ");
        String lastName = sc.nextLine();

        return new WeeklyEmployee(firstName, lastName);
    }
}*/

class ContractEmployee
 {
    String name;
    String designation;

    public ContractEmployee(String name, String designation) 
    {
        this.name = name;
        this.designation = designation;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public String getDesig() 
    {
        return designation;
    }

    public double calculateWages()
     {
    
        return 0.0; // Default implementation, to be overridden in sub-classes
    }
}

class HourlyEmployee extends ContractEmployee
 {
     int hoursWorked;
     double wagePerHour;

    public HourlyEmployee(String name, String designation, int hoursWorked, double wagePerHour) 
    {
        super(name, designation);
        this.hoursWorked = hoursWorked;
        this.wagePerHour = wagePerHour;
    }

   // @Override
    public double calculateWages() 
    {
        return hoursWorked * wagePerHour * 4; // Assuming 4 weeks in a month
    }

   // @Override
    public String getDesig() 
    {
        return "Hourly " + super.getDesig();
    }
}

class WeeklyEmployee extends ContractEmployee
 {
     int weeksWorked;
     double wagePerWeek;

    public WeeklyEmployee(String name, String designation, int weeksWorked, double wagePerWeek) 
    {
        super(name, designation);
        this.weeksWorked = weeksWorked;
        this.wagePerWeek = wagePerWeek;
    }

    //@Override
    public double calculateWages() 
    {
        return weeksWorked * wagePerWeek;
    }

   // @Override
    public String getDesig() 
    {
        return "Weekly " + super.getDesig();
    }
}

public class EmployeeDetails
 {
    public static void main(String[] args) 
    {
        HourlyEmployee hour = new HourlyEmployee("John Doe", "Developer", 160, 20);
        WeeklyEmployee week= new WeeklyEmployee("Jane Doe", "Designer", 4, 500);

        System.out.println("Hourly Employee Details:");
        hour.displayInfo();
        System.out.println("Monthly Wages: $" + hour.calculateWages());
        System.out.println("Employee Designation: " + hour.getDesig());

        System.out.println("\nWeekly Employee Details:");
        weeks.displayInfo();
        System.out.println("Monthly Wages: $" + week.calculateWages());
        System.out.println("Employee Designation: " + week.getDesig());
    }
}





