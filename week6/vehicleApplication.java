/*5. Write an application to create a super class Vehicle with information vehicle
number,insurance number,color and methods getConsumption() displayConsumption().
Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
average() to print the maintenance And average of vehicle.*/





/*import java.util.Scanner;

class Vehicle
 {
    String vehicleNumber;
     String insuranceNumber;
     String color;

    public Vehicle(String vehicleNumber, String insuranceNumber, String color)
     {
        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
    }

    public double getConsumption() 
    {
        
        return 0.0;
    }

    public void displayConsumption() 
    {
        System.out.println("Fuel Consumption: " + getConsumption() + " liters per 100 km");
    }
}

class TwoWheeler extends Vehicle 
{
    public TwoWheeler(String vehicleNumber, String insuranceNumber, String color) 
    {
        super(vehicleNumber, insuranceNumber, color);
    }

    public double getConsumption() 
    {

        return 3.5; // Example value, modify as needed
    }

    public void maintenance() 
    {
        System.out.println("Two-wheeler maintenance is needed every 5000 km.");
    }

    public void average() 
    {
        System.out.println("Two-wheeler average speed is 60 km/h.");
    }
}

class FourWheeler extends Vehicle
 {
    public FourWheeler(String vehicleNumber, String insuranceNumber, String color)
     {
        super(vehicleNumber, insuranceNumber, color);
    }

    public double getConsumption()
     {
        return 8.0; // Example value, modify as needed
    }

    public void maintenance()
     {
        System.out.println("Four-wheeler maintenance is needed every 10000 km.");
    }

    public void average()
     {
        System.out.println("Four-wheeler average speed is 80 km/h.");
    }
}

public class vehicleApplication 
{
    public static void main(String[] args) 
    {
        TwoWheeler two= createTwoWheeler();
        FourWheeler four = createFourWheeler();
        

        System.out.println("Details of Two-Wheeler:");
         two.displayConsumption();
         two.maintenance();
         two.average();

        System.out.println("\nDetails of Four-Wheeler:");
        four.displayConsumption();
        four.maintenance();
        four.average();
    }

    public static TwoWheeler createTwoWheeler()
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two-Wheeler Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Two-Wheeler Insurance Number: ");
        String insuranceNumber = sc.nextLine();

        System.out.print("Enter Two-Wheeler Color: ");
        String color = sc.nextLine();

        return new TwoWheeler(vehicleNumber, insuranceNumber, color);
    }

    public static FourWheeler createFourWheeler()
     {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Four-Wheeler Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Four-Wheeler Insurance Number: ");
        String insuranceNumber = sc.nextLine();

        System.out.print("Enter Four-Wheeler Color: ");
        String color = sc.nextLine();

        return new FourWheeler(vehicleNumber, insuranceNumber, color);
    }
}*/




class Vehicle {
    protected String vehicleNumber;
    protected String insuranceNumber;
    protected String color;

    public Vehicle(String vehicleNumber, String insuranceNumber, String color) {
        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
    }

    public double getConsumption() {
        return 0.0; // Placeholder, to be overridden in subclasses
    }

    public void displayConsumption() {
        System.out.println("Vehicle Consumption: " + getConsumption() + " km/l");
    }
}

class TwoWheeler extends Vehicle 
{
    public TwoWheeler(String vehicleNumber, String insuranceNumber, String color)
     {
        super(vehicleNumber, insuranceNumber, color);
    }

    @Override
    public double getConsumption() {
        return 50.0; // Example: two-wheeler average consumption
    }

    public void maintenance() {
        System.out.println("Two-wheeler maintenance: Regular check and oil change");
    }

    public void average() {
        System.out.println("Two-wheeler average: 50 km/l");
    }
}

class FourWheeler extends Vehicle 
{
    public FourWheeler(String vehicleNumber, String insuranceNumber, String color) 
    {
        super(vehicleNumber, insuranceNumber, color);
    }

    @Override
    public double getConsumption()
     {
        return 15.0; // Example: four-wheeler average consumption
    }

    public void maintenance() 
    {
        System.out.println("Four-wheeler maintenance: Regular service and tire rotation");
    }

    public void average() {
        System.out.println("Four-wheeler average: 15 km/l");
    }
}

public class vehicleApplication {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler("TN1234", "INS1234", "Red");
        FourWheeler car = new FourWheeler("KA5678", "INS5678", "Blue");

        System.out.println("Two-Wheeler Details:");
        bike.displayConsumption();
        bike.maintenance();
        bike.average();

        System.out.println("\nFour-Wheeler Details:");
        car.displayConsumption();
        car.maintenance();
        car.average();
    }
}

